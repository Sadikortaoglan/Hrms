package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.CapabilityService;
import com.sadik.hrmscf.business.constans.RestPathContants;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.Capabilities;
import com.sadik.hrmscf.entities.dtos.CapabilitiesWithCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(path = RestPathContants.ROOT_CAPABILITY_PATH)
@CrossOrigin
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

    @GetMapping("/getall")
    public DataResult<List<Capabilities>> getall(){
        return capabilityService.getall();
    }
}
