package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.WorkExperience;
import com.sadik.hrmscf.entities.dtos.WorkExperienceForCurriculumVitaeDto;
import java.util.List;
import java.util.List;
public interface WorkExperienceService {

    Result delete(int id);

    Result workExperienceForJobSeekerAdd(WorkExperienceForCurriculumVitaeDto workExperienceForCurriculumVitaeDto);

    DataResult<List<WorkExperience>> getall();



}
