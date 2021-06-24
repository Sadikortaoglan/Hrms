package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.CapabilityService;
import com.sadik.hrmscf.business.abstracts.CurriculumVitaeService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessDataResult;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.CapabilityDao;
import com.sadik.hrmscf.entities.concretes.Capabilities;
import com.sadik.hrmscf.entities.dtos.CapabilitiesWithCurriculumVitaeDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapabilityManager implements CapabilityService {

    private final CapabilityDao capabilityDao;
    private final ModelMapper modelMapper;

    @Autowired
    public CapabilityManager(CapabilityDao capabilityDao,ModelMapper modelMapper) {
        this.capabilityDao = capabilityDao;
        this.modelMapper=modelMapper;
    }

    @Override
    public Result jobSeekerAdd(CapabilitiesWithCurriculumVitaeDto capabilitiesWithCurriculumVitaeDto) {
    Capabilities capabilities=modelMapper.map(capabilitiesWithCurriculumVitaeDto,Capabilities.class);


        capabilityDao.save(capabilities);
        return new SuccessResult(Messages.Success);


    }

    @Override
    public DataResult<List<Capabilities>> getall() {
        return new SuccessDataResult<>(capabilityDao.findAll(),Messages.Listed);
    }
}
