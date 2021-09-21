package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.JobPostingService;
import com.sadik.hrmscf.business.constans.RestPathContants;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.JobPosting;
import com.sadik.hrmscf.entities.dtos.JobPostingForEmployerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = RestPathContants.ROOT_JOBPOSTING_PATH)
@CrossOrigin
public class JobPostingsController {


    private final JobPostingService jobPostingService;

    @Autowired
    public JobPostingsController(JobPostingService jobPostingService) {
        this.jobPostingService = jobPostingService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPostingForEmployerDto jobPostingForEmployerDto) {
        return this.jobPostingService.add(jobPostingForEmployerDto);
    }

    @GetMapping("/getall")
    public DataResult<List<JobPosting>> getAll() {
        return this.jobPostingService.getAll();
    }

    @GetMapping("findByIsActiveTrue")
    public DataResult<List<JobPosting>> findByActivateTrue() {
        return jobPostingService.findByActivateTrue();
    }

    @PostMapping("/findUpdatedAtIsActiveTrue")
    public DataResult<List<JobPosting>> findUpdatedAtIsActiveTrue(@RequestBody LocalDate localDate) {
        return this.jobPostingService.findByUpdatedAtAndActivateTrue(localDate);

    }


}
