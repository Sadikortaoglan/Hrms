package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.CityService;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/city")
public class CitiesController {

    private CityService cityService;

    @Autowired
    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping("/add")

    public Result add(@RequestBody City city){
    return cityService.add(city);
    }
}
