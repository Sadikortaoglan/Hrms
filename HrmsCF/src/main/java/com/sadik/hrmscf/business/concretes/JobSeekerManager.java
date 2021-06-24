package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.JobSeekerService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.adapters.mail.MailService;
import com.sadik.hrmscf.core.utilities.business.BusinessRules;
import com.sadik.hrmscf.core.utilities.email.FakeEmailService;
import com.sadik.hrmscf.core.utilities.result.*;
import com.sadik.hrmscf.dataAccess.abstracts.JobSeekerDao;
import com.sadik.hrmscf.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    private FakeEmailService fakeEmailService;
    private MailService mailService;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao,
                            FakeEmailService fakeEmailService,MailService mailService) {
        this.jobSeekerDao = jobSeekerDao;
        this.fakeEmailService = fakeEmailService;
        this.mailService=mailService;

    }

    @Override
    public DataResult<JobSeeker> add(JobSeeker jobSeeker) {

        if (BusinessRules.isFieldsEntered(jobSeeker.getLastName(), jobSeeker.getIdentityNumber(), jobSeeker.getFirstName(),
                String.valueOf(jobSeeker.getDateOfBirth()), jobSeeker.getEmail())) {
            return new ErrorDataResult<JobSeeker>(Messages.RequiredFields);
        }
        if (jobSeekerDao.findByEmail(jobSeeker.getEmail()) != null) {

            return new ErrorDataResult<JobSeeker>(null, Messages.ExistsInSystem);
        }
        if (jobSeekerDao.findJobSeekerByIdentityNumber(jobSeeker.getIdentityNumber()) != null) {
            return new ErrorDataResult<JobSeeker>(null, Messages.ExistsIdentityNumber);
        }
        if (!fakeEmailService.check()) {
            return new ErrorDataResult<>(Messages.EmailNotVerify);
        } else {
            mailService.sendMail(jobSeeker.getEmail(),"Hrms doğrulama kodu","sitemize keşke gelmeseydin işsiz :D");
            return new SuccessDataResult<JobSeeker>(jobSeekerDao.save(jobSeeker), Messages.Success);


        }
    }

    @Override
    public Result delete(int id) {
        jobSeekerDao.deleteById(id);
        return new SuccessResult(Messages.Deleted);

    }

    @Override
    public Result get(int id) {
        jobSeekerDao.findById(id);
        return new SuccessResult(Messages.Success);
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), Messages.Listed);
    }


}


