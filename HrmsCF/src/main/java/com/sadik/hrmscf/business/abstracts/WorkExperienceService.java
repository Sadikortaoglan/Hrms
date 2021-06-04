package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.WorkExperience;
import com.sadik.hrmscf.entities.dtos.WorkExperienceForCurriculumVitaeDto;

public interface WorkExperienceService {

    Result add(WorkExperience workExperience);
    Result delete(int id);

    Result workExperienceForJobSeekerAdd(WorkExperienceForCurriculumVitaeDto workExperienceForCurriculumVitaeDto);




}
