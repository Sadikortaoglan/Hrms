package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.AuthService;
import com.sadik.hrmscf.business.abstracts.EmployerService;
import com.sadik.hrmscf.business.abstracts.JobSeekerService;
import com.sadik.hrmscf.business.abstracts.UserService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.entity.User;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessDataResult;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.entities.concretes.Employer;
import com.sadik.hrmscf.entities.concretes.JobSeeker;
import com.sadik.hrmscf.entities.dtos.EmployerForRegisterDto;
import com.sadik.hrmscf.entities.dtos.JobSeekerRegisterDto;
import com.sadik.hrmscf.entities.dtos.UserForLoginDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthManager implements AuthService {

    private JobSeekerService jobSeekerService;
    private EmployerService employerService;
    private UserService userService;
    private ModelMapper modelMapper;

    @Autowired
    public AuthManager(JobSeekerService jobSeekerService, EmployerService employerService,
                       UserService userService,ModelMapper modelMapper)
    {
        this.jobSeekerService = jobSeekerService;
        this.employerService = employerService;
        this.userService=userService;
        this.modelMapper=modelMapper;
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
        return  this.jobSeekerService.add(jobSeeker);


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
}
