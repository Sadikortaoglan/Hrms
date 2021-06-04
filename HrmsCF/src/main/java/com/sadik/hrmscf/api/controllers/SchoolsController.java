package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.SchoolService;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.dtos.SchoolWithCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/school")
public class SchoolsController {
    private SchoolService schoolService;

    @Autowired
    public SchoolsController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/add")
    public Result schoolWithJobSeekerAdd(@RequestBody SchoolWithCurriculumVitaeDto schoolWithCurriculumVitaeDto)
    {
        return  schoolService.schoolWithJobSeekerAdd(schoolWithCurriculumVitaeDto);
    }
}
