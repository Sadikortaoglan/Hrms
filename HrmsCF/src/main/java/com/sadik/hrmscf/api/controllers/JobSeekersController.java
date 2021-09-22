package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.JobSeekerService;
import com.sadik.hrmscf.business.constans.RestPathContants;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.JobSeeker;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = RestPathContants.ROOT_JOBSEEKER_PATH)
@CrossOrigin
public class JobSeekersController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping(value = RestPathContants.PATH_GETALL)
    public DataResult<List<JobSeeker>> getAll() {
        return jobSeekerService.getAll();
    }

    @PostMapping(value = RestPathContants.PATH_ADD)
    public DataResult<JobSeeker> add(@RequestBody JobSeeker jobSeeker) {
        return jobSeekerService.add(jobSeeker);
    }

    @DeleteMapping(value = RestPathContants.PATH_DELETE)
    public Result delete(@RequestBody int id) {
        return jobSeekerService.delete(id);
    }
}
