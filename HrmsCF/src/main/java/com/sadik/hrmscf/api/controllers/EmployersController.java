package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.EmployerService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employers")
@CrossOrigin
public class EmployersController {

    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employer>> getall() {
        return employerService.getAll();
    }

    /*@PostMapping("/add")
    public Result add(Employer employer) {
        employerService.save(employer);
        return new SuccessResult(Messages.Added);
    }*/

    @DeleteMapping
    public Result delete(int id) {
        return employerService.delete(id);
    }


}
