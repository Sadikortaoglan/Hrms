package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.CurriculumVitaeService;
import com.sadik.hrmscf.business.abstracts.LanguageService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessDataResult;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.LanguageDao;
import com.sadik.hrmscf.entities.concretes.Language;
import com.sadik.hrmscf.entities.dtos.LanguageWithCurriculumVitaeDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private LanguageDao languageDao;
    private CurriculumVitaeService curriculumVitaeService;
    private ModelMapper modelMapper;
    @Autowired
    public LanguageManager(LanguageDao languageDao, CurriculumVitaeService
            curriculumVitaeService,ModelMapper modelMapper)
    {
        this.languageDao = languageDao;
        this.curriculumVitaeService = curriculumVitaeService;
        this.modelMapper=modelMapper;
    }
    @Override
    public DataResult<List<Language>> getall() {
        return new SuccessDataResult<>(languageDao.findAll(),Messages.Listed);
    }

    @Override
    public Result languageWithJobSeekerAdd(LanguageWithCurriculumVitaeDto languageWithCurriculumVitaeDto) {
        Language language=modelMapper.map(languageWithCurriculumVitaeDto, Language.class);//ModelMapper ile dto değerleri ile entitydeki değerlerimiz eşleştiriliyor.

        this.languageDao.save(language);
      return   new SuccessResult(Messages.Success);
    }
}
