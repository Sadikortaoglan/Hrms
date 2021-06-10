package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.SocialMediaService;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.dtos.SocialMediaForCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
