package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.WorkExperienceService;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.WorkExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/workExperiences")
public class WorkExperiencesController {

    private WorkExperienceService workExperienceService;
    @Autowired
    public WorkExperiencesController(WorkExperienceService workExperienceService) {
        this.workExperienceService = workExperienceService;
    }
    @PostMapping("/add")
    public Result add(@RequestBody WorkExperience workExperience){
        return workExperienceService.add(workExperience);
    }
}
