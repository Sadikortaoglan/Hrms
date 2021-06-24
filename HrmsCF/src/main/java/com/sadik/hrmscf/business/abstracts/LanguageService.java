package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.Language;
import com.sadik.hrmscf.entities.dtos.LanguageWithCurriculumVitaeDto;
import java.util.List;

public interface LanguageService {
    DataResult<List<Language>> getall();

    Result languageWithJobSeekerAdd(LanguageWithCurriculumVitaeDto languageWithCurriculumVitaeDto);
}
