package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.SocialMediaService;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.SocialMedia;
import com.sadik.hrmscf.entities.dtos.SocialMediaForCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("api/socialmedia")
public class SocialMediasController {

    private SocialMediaService socialMediaService;

    @Autowired
    public SocialMediasController(SocialMediaService socialMediaService) {
        this.socialMediaService = socialMediaService;
    }

    @PostMapping("/add")

    public Result SocialMediaWithJobSeeker(@RequestBody SocialMediaForCurriculumVitaeDto socialMediaForCurriculumVitaeDto){
        return socialMediaService.SocialMediaWithJobSeeker(socialMediaForCurriculumVitaeDto);
    }

    @GetMapping("/getall")
    public DataResult<List<SocialMedia>> getall(){
        return socialMediaService.getall();
    }
}
