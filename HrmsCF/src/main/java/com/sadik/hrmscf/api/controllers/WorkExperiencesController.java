package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.WorkExperienceService;
import com.sadik.hrmscf.business.constans.RestPathContants;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.WorkExperience;
import com.sadik.hrmscf.entities.dtos.WorkExperienceForCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(path = RestPathContants.ROOT_WORKEXPERIENCE_PATH)
@CrossOrigin
public class WorkExperiencesController {

    private WorkExperienceService workExperienceService;
    @Autowired
    public WorkExperiencesController(WorkExperienceService workExperienceService) {
        this.workExperienceService = workExperienceService;
    }
    @PostMapping(value = RestPathContants.PATH_WORK_FOR_JOBSEEKER_ADD)
    public Result workExperienceForJobSeekerAdd(@RequestBody  WorkExperienceForCurriculumVitaeDto workExperienceForCurriculumVitaeDto ){
        return workExperienceService.workExperienceForJobSeekerAdd(workExperienceForCurriculumVitaeDto);
    }

    @GetMapping(value = RestPathContants.PATH_GETALL)
    public DataResult<List<WorkExperience>> getall(){
        return workExperienceService.getall();
    }

    @DeleteMapping(value = RestPathContants.PATH_DELETE_BY_ID)
    public Result deleteById(@RequestParam int id){
        return workExperienceService.delete(id);
    }
}
