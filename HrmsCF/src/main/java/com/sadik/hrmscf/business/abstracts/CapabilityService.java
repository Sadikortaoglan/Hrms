package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.Capabilities;
import com.sadik.hrmscf.entities.dtos.CapabilitiesWithCurriculumVitaeDto;
import java.util.List;
public interface CapabilityService {

    Result jobSeekerAdd(CapabilitiesWithCurriculumVitaeDto capabilitiesWithCurriculumVitaeDto);
    DataResult<List<Capabilities>> getall();
}
