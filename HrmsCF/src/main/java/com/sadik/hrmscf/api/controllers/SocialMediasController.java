package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.SocialMediaService;
import com.sadik.hrmscf.business.constans.RestPathContants;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.SocialMedia;
import com.sadik.hrmscf.entities.dtos.SocialMediaForCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(path = RestPathContants.ROOT_SOCİALMEDIA_PATH)
@CrossOrigin
public class SocialMediasController {

    private SocialMediaService socialMediaService;

    @Autowired
    public SocialMediasController(SocialMediaService socialMediaService) {
        this.socialMediaService = socialMediaService;
    }

    @PostMapping(value = RestPathContants.PATH_SOCIALMEDIA_WITH_JOBSEEKER)

    public Result SocialMediaWithJobSeeker(@RequestBody SocialMediaForCurriculumVitaeDto socialMediaForCurriculumVitaeDto){
        return socialMediaService.SocialMediaWithJobSeeker(socialMediaForCurriculumVitaeDto);
    }

    @GetMapping(value = RestPathContants.PATH_GETALL)
    public DataResult<List<SocialMedia>> getall(){
        return socialMediaService.getall();
    }
}
