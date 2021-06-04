package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.dtos.LanguageWithCurriculumVitaeDto;

public interface LanguageService {
    Result getall();

    Result languageWithJobSeekerAdd(LanguageWithCurriculumVitaeDto languageWithCurriculumVitaeDto);
}
