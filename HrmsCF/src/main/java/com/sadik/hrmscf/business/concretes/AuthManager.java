package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.*;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.adapters.mail.MailService;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessDataResult;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.core.verification.VerificationService;
import com.sadik.hrmscf.entities.concretes.Employer;
import com.sadik.hrmscf.entities.concretes.JobSeeker;
import com.sadik.hrmscf.entities.dtos.EmployerForRegisterDto;
import com.sadik.hrmscf.entities.dtos.JobSeekerRegisterDto;
import com.sadik.hrmscf.entities.dtos.UserForLoginDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AuthManager implements AuthService {

    private JobSeekerService jobSeekerService;
    private EmployerService employerService;
    private UserService userService;
    private ModelMapper modelMapper;
    private  MailService mailService;
    private VerificationService verificationService;

    @Autowired
    public AuthManager(JobSeekerService jobSeekerService, EmployerService employerService,
                       UserService userService,ModelMapper modelMapper
                       ,MailService mailService,VerificationService verificationService)
    {
        this.jobSeekerService = jobSeekerService;
        this.employerService = employerService;
        this.userService=userService;
        this.modelMapper=modelMapper;
        this.mailService=mailService;
        this.verificationService=verificationService;

    }

    @Override
    public DataResult<JobSeeker> registerForJobSeeker(JobSeekerRegisterDto jobSeekerRegisterDto) {

        /*JobSeeker jobSeeker = new JobSeeker();

       jobSeeker.setActivate(true);

       jobSeeker.setEmail(jobSeekerRegisterDto.getEmail());
       jobSeeker.setFirstName(jobSeekerRegisterDto.getFirstName());
       jobSeeker.setLastName(jobSeekerRegisterDto.getLastName());
       jobSeeker.setIdentityNumber(jobSeekerRegisterDto.getIdentityNumber());
       jobSeeker.setPasswordHash(jobSeekerRegisterDto.getPassword());
       jobSeeker.setDateOfBirth(jobSeekerRegisterDto.getDateOfBirth());
       jobSeeker.setGender(jobSeekerRegisterDto.getGender());*/
        JobSeeker jobSeeker=modelMapper.map(jobSeekerRegisterDto,JobSeeker.class);
        jobSeekerService.add(jobSeeker);
       String code= verificationService.sendCode();
        mailService.sendMail(jobSeekerRegisterDto.getEmail(),"Hrms verification code","Doğrulama kodunuz : " + code + "\nİsminiz : "+jobSeekerRegisterDto.getFirstName()+"\nSoyisminiz : " + jobSeekerRegisterDto.getLastName()+"\nHrms websitesine hoş geldiniz...Güzel bi kariyer sizi bekliyor...\nSevgiyle Hrms Website");
        return new SuccessDataResult<>(Messages.Success);


    }

    @Override
    public DataResult<Employer> registerForEmployer(EmployerForRegisterDto employerForRegisterDto) {
        Employer employer=modelMapper.map(employerForRegisterDto,Employer.class);
       return employerService.save(employer);

    }

    @Override
    public Result UserForLogin(UserForLoginDto userForLogin) {
        userService.findByEmailAndPasswordHash(userForLogin.getEmail(),userForLogin.getPassword());
        return  new SuccessResult(Messages.Success);

    }
/*    private void verificationCodeRecord(String code, int id ,String email) {

        VerificationCode verificationCode = new VerificationCode(id,code,false,LocalDateTime.now());
        this.verificationCodeService.add(verificationCode);
        System.out.println("Verification code has been sent to " + email );

    }*/

}
