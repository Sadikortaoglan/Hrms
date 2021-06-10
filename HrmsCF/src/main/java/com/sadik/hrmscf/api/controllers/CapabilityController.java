package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.CapabilityService;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.dtos.CapabilitiesWithCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/capability")

public class CapabilityController {

    private CapabilityService capabilityService;

    @Autowired
    public CapabilityController(CapabilityService capabilityService) {
        this.capabilityService = capabilityService;
    }

    @PostMapping("/add")
    public Result jobSeekerAdd(@RequestBody CapabilitiesWithCurriculumVitaeDto capabilitiesWithCurriculumVitaeDto){
        return capabilityService.jobSeekerAdd(capabilitiesWithCurriculumVitaeDto);
    }
}
