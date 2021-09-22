package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.LanguageService;
import com.sadik.hrmscf.business.constans.RestPathContants;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.dtos.LanguageWithCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = RestPathContants.ROOT_LANGUAGE_PATH)
@CrossOrigin
public class LanguagesController {

    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping(value = RestPathContants.PATH_LANGUAGE_WITH_JOBSEEKER_ADD)
    public Result languageWithJobSeekerAdd(@RequestBody LanguageWithCurriculumVitaeDto languageWithCurriculumVitaeDto)
    {
        return languageService.languageWithJobSeekerAdd(languageWithCurriculumVitaeDto);
    }

    @GetMapping(value = RestPathContants.PATH_GETALL)
    public Result getall(){
      return  languageService.getall();
    }
}
