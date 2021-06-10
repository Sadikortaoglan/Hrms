package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.entity.User;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.Employer;
import com.sadik.hrmscf.entities.concretes.JobSeeker;
import com.sadik.hrmscf.entities.dtos.EmployerForRegisterDto;
import com.sadik.hrmscf.entities.dtos.JobSeekerRegisterDto;
import com.sadik.hrmscf.entities.dtos.UserForLoginDto;

public interface AuthService {
    DataResult<JobSeeker> registerForJobSeeker(JobSeekerRegisterDto jobSeekerRegisterDto);
    DataResult<Employer> registerForEmployer(EmployerForRegisterDto employerForRegisterDto);

    Result UserForLogin(UserForLoginDto userForLogin);
}
