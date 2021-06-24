package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.School;
import com.sadik.hrmscf.entities.dtos.SchoolWithCurriculumVitaeDto;
import java.util.List;
public interface SchoolService {
    Result schoolWithJobSeekerAdd(SchoolWithCurriculumVitaeDto schoolWithCurriculumVitaeDto);

    DataResult<List<School>> getall();

}
