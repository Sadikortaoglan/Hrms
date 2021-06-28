package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.WorkExperienceService;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.WorkExperience;
import com.sadik.hrmscf.entities.dtos.WorkExperienceForCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/workExperiences")
@CrossOrigin
public class WorkExperiencesController {

    private WorkExperienceService workExperienceService;
    @Autowired
    public WorkExperiencesController(WorkExperienceService workExperienceService) {
        this.workExperienceService = workExperienceService;
    }
    @PostMapping("/workExperienceForJobSeekerAdd")
    public Result workExperienceForJobSeekerAdd(@RequestBody  WorkExperienceForCurriculumVitaeDto workExperienceForCurriculumVitaeDto ){
        return workExperienceService.workExperienceForJobSeekerAdd(workExperienceForCurriculumVitaeDto);
    }

    @GetMapping("/getall")
    public DataResult<List<WorkExperience>> getall(){
        return workExperienceService.getall();
    }

    @DeleteMapping("/deleteById")
    public Result deleteById(@RequestParam int id){
        return workExperienceService.delete(id);
    }
}
