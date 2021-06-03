package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.CurriculumVitaeService;
import com.sadik.hrmscf.business.abstracts.LanguageService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.LanguageDao;
import com.sadik.hrmscf.entities.concretes.Language;
import com.sadik.hrmscf.entities.dtos.LanguageWithCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageManager implements LanguageService {

    private LanguageDao languageDao;
    private CurriculumVitaeService curriculumVitaeService;
    @Autowired
    public LanguageManager(LanguageDao languageDao, CurriculumVitaeService curriculumVitaeService) {
        this.languageDao = languageDao;
        this.curriculumVitaeService = curriculumVitaeService;
    }
    @Override
    public Result getall() {
        return null;
    }

    @Override
    public Result languageWithJobSeekerAdd(LanguageWithCurriculumVitaeDto languageWithCurriculumVitaeDto) {
        Language language=new Language();

        language.setCurriculumVitae(curriculumVitaeService.findById(languageWithCurriculumVitaeDto.getCurriculumId()));

        language.setLanguage(languageWithCurriculumVitaeDto.getLanguage());
        language.setLevel(languageWithCurriculumVitaeDto.getLevel());

        this.languageDao.save(language);
      return   new SuccessResult(Messages.Success);
    }
}
