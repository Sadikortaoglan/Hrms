package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.dtos.CapabilitiesWithCurriculumVitaeDto;

public interface CapabilityService {

    Result jobSeekerAdd(CapabilitiesWithCurriculumVitaeDto capabilitiesWithCurriculumVitaeDto);

}
