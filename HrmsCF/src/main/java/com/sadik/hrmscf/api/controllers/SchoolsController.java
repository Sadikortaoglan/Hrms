package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.SchoolService;
import com.sadik.hrmscf.business.constans.RestPathContants;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.School;
import com.sadik.hrmscf.entities.dtos.SchoolWithCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping(path = RestPathContants.ROOT_SCHOOL_PATH)
@CrossOrigin
public class SchoolsController {
    private SchoolService schoolService;

    @Autowired
    public SchoolsController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping(value = RestPathContants.PATH_SCHOOL_WITH_JOBSEEKER_ADD)
    public Result schoolWithJobSeekerAdd(@Valid @RequestBody SchoolWithCurriculumVitaeDto schoolWithCurriculumVitaeDto)
    {
        return  schoolService.schoolWithJobSeekerAdd(schoolWithCurriculumVitaeDto);
    }
    @GetMapping(value = RestPathContants.PATH_GETALL)
    public DataResult<List<School>> getall(){
        return schoolService.getall();
    }
}
