package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.CurriculumVitaeService;
import com.sadik.hrmscf.business.constans.RestPathContants;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.CurriculumVitae;
import com.sadik.hrmscf.entities.dtos.CoverletterForCurriculumVitaeDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = RestPathContants.ROOT_CURRICULUM_PATH)
@CrossOrigin
public class CurriculumsController {
    private CurriculumVitaeService curriculumVitaeService;

    public CurriculumsController(CurriculumVitaeService curriculumVitaeService) {
        this.curriculumVitaeService = curriculumVitaeService;
    }

    @PostMapping(value = RestPathContants.PATH_COVERLETTER_FOR_JOBSEEKER_ADD)
    public Result coverletterForJobSeekerAdd(@RequestBody CoverletterForCurriculumVitaeDto coverletterForCurriculumVitaeDto){
        return curriculumVitaeService.coverletForJobSeekerAdd(coverletterForCurriculumVitaeDto);
    }
    @GetMapping(value = RestPathContants.PATH_GETALL)
    public DataResult<List<CurriculumVitae>> getall(){
       return curriculumVitaeService.getAll();
    }
    @GetMapping(value = RestPathContants.PATH_FIND_BY_JOBSEEKER_ID)
    public CurriculumVitae findByJobSeekerId(@RequestParam int id){
       return curriculumVitaeService.findByJobSeekerId(id);

    }
}
