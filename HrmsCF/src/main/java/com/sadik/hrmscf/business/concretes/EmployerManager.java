package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.EmployerService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.business.BusinessRules;
import com.sadik.hrmscf.core.utilities.email.FakeEmailService;
import com.sadik.hrmscf.core.utilities.result.*;
import com.sadik.hrmscf.dataAccess.abstracts.EmployerDao;
import com.sadik.hrmscf.entities.concretes.Employer;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.sadik.hrmscf.core.utilities.security.Regex.verify;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    private FakeEmailService fakeEmailService;

    public EmployerManager(EmployerDao employerDao, FakeEmailService fakeEmailService) {
        this.employerDao = employerDao;
        this.fakeEmailService = fakeEmailService;
    }

    @Override
    public DataResult<Employer> save(Employer employer) {
        if (!BusinessRules.isFieldsEntered(employer.getCompanyName(),
                employer.getPasswordHash(),
                employer.getWebSite(), employer.getEmail())) {
            return new ErrorDataResult<>(Messages.ExistsInSystem);
        }
        if (!verify(employer.getEmail(), employer.getWebSite())) {
            return new ErrorDataResult<Employer>(Messages.CorrectFormat);

        } else if (employerDao.findByEmail(employer.getEmail()) != null) {
            return new ErrorDataResult<Employer>(Messages.ExistsInSystem);

        } else if (!fakeEmailService.check()) {
            return new ErrorDataResult<>(Messages.EmailNotVerify);

        } else {
            return new SuccessDataResult<Employer>(Messages.Success);
        }
    }

    @Override
    public Result delete(int id) {
        if (employerDao.findById(id) != null) {
            employerDao.deleteById(id);
            return new SuccessResult(Messages.Deleted);
        } else {
            return new ErrorResult(Messages.Error);
        }
    }

    @Override
    public DataResult<List<Employer>> getAll() {

        return new SuccessDataResult<>(employerDao.findAll(), Messages.Listed);
    }

}
