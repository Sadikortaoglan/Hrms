package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.LanguageService;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.dtos.LanguageWithCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {

    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @PostMapping("/add")

    public Result languageWithJobSeekerAdd(@RequestBody LanguageWithCurriculumVitaeDto languageWithCurriculumVitaeDto)
    {
        return languageService.languageWithJobSeekerAdd(languageWithCurriculumVitaeDto);
    }
}
