package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.dtos.SchoolWithCurriculumVitaeDto;

public interface SchoolService {

    Result schoolWithJobSeekerAdd(SchoolWithCurriculumVitaeDto schoolWithCurriculumVitaeDto);


}
