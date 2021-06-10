package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.CapabilityService;
import com.sadik.hrmscf.business.abstracts.CurriculumVitaeService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.CapabilityDao;
import com.sadik.hrmscf.entities.concretes.Capabilities;
import com.sadik.hrmscf.entities.dtos.CapabilitiesWithCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapabilityManager implements CapabilityService {

    private CapabilityDao capabilityDao;
    private CurriculumVitaeService curriculumVitaeService;

    @Autowired
    public CapabilityManager(CapabilityDao capabilityDao, CurriculumVitaeService curriculumVitaeService) {
        this.capabilityDao = capabilityDao;
        this.curriculumVitaeService = curriculumVitaeService;
    }

    @Override
    public Result jobSeekerAdd(CapabilitiesWithCurriculumVitaeDto capabilitiesWithCurriculumVitaeDto) {

        Capabilities capabilities=new Capabilities();
        capabilities.setCurriculumVitae(curriculumVitaeService.findById(capabilitiesWithCurriculumVitaeDto.getCurriculumId()));

        capabilities.setName(capabilitiesWithCurriculumVitaeDto.getCapabilityName());
        capabilities.setType(capabilitiesWithCurriculumVitaeDto.getCapabilityType());

        capabilityDao.save(capabilities);
        return new SuccessResult(Messages.Success);


    }
}
