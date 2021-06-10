package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.CurriculumVitae;
import com.sadik.hrmscf.entities.dtos.CoverletterForCurriculumVitaeDto;


import java.util.List;

public interface CurriculumVitaeService {
    CurriculumVitae findById(int id);

    DataResult<List<CurriculumVitae>> getAll();

    Result coverletForJobSeekerAdd(CoverletterForCurriculumVitaeDto coverletterForCurriculumVitaeDto);

}
