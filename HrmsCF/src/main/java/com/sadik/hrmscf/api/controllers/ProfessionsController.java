package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.ProfessionService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.business.constans.RestPathContants;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.entities.concretes.Profession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = RestPathContants.ROOT_PROFESSİON_PATH)
@CrossOrigin
public class ProfessionsController {
    @Autowired
    private ProfessionService professionService;

    @PostMapping(value = RestPathContants.PATH_ADD)
    public Result add(@RequestBody Profession profession){
        professionService.add(profession);
        return new SuccessResult(Messages.Success);
    }
    @GetMapping(value = RestPathContants.PATH_GETALL)
    public DataResult<List<Profession>> getall(){
        return professionService.getall();
    }
}
