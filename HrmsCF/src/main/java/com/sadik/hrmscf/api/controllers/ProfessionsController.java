package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.ProfessionService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.entities.concretes.Profession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/profession")
public class ProfessionsController {
    @Autowired
    private ProfessionService professionService;

    @PostMapping("/add")
    public Result add(@RequestBody Profession profession){
        professionService.add(profession);
        return new SuccessResult(Messages.Success);
    }
}
