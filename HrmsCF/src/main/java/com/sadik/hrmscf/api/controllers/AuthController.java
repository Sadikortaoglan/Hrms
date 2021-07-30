package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.AuthService;
import com.sadik.hrmscf.business.abstracts.EmployerService;
import com.sadik.hrmscf.business.abstracts.JobSeekerService;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.Employer;
import com.sadik.hrmscf.entities.concretes.JobSeeker;
import com.sadik.hrmscf.entities.dtos.EmployerForRegisterDto;
import com.sadik.hrmscf.entities.dtos.JobSeekerRegisterDto;
import com.sadik.hrmscf.entities.dtos.UserForLoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/auth")
@CrossOrigin
public class AuthController {
    JobSeekerService jobSeekerService;
    EmployerService employerService;
    AuthService authService;

    @Autowired
    public AuthController(JobSeekerService jobSeekerService, EmployerService employerService,AuthService authService) {
        this.jobSeekerService = jobSeekerService;
        this.employerService = employerService;
        this.authService=authService;
    }

    @PostMapping("/registerForJobSeeker")
    public DataResult<JobSeeker> registerForJobSeeker(@Valid @RequestBody JobSeekerRegisterDto jobSeekerRegisterDto)
    {
      return authService.registerForJobSeeker(jobSeekerRegisterDto);

    }

    @PostMapping("/userForLogin")
    public Result login(@Valid @RequestBody UserForLoginDto userForLoginDto){
        return authService.UserForLogin(userForLoginDto);
    }

    @PostMapping("/registerForEmployer")
    public DataResult<Employer> employerForRegister(@Valid @RequestBody EmployerForRegisterDto employerForRegisterDto){
        return authService.registerForEmployer(employerForRegisterDto);
    }
}
