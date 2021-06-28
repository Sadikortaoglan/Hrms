package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.CurriculumVitaeService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.*;
import com.sadik.hrmscf.dataAccess.abstracts.CurriculumVitaeDao;
import com.sadik.hrmscf.entities.concretes.CurriculumVitae;
import com.sadik.hrmscf.entities.dtos.CoverletterForCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService {

 private CurriculumVitaeDao curriculumVitaeDao;

    @Autowired
    public CurriculumVitaeManager(CurriculumVitaeDao curriculumVitaeDao) {
        this.curriculumVitaeDao = curriculumVitaeDao;
    }

    @Override
    public CurriculumVitae findById(int id) {
        return curriculumVitaeDao.findById(id);
    }

    @Override
    public DataResult<List<CurriculumVitae>> getAll() {
        return new SuccessDataResult<>(curriculumVitaeDao.findAll(), Messages.Listed);

    }

    @Override
    public Result coverletForJobSeekerAdd(CoverletterForCurriculumVitaeDto coverletterForCurriculumVitaeDto) {

        CurriculumVitae curriculumVitae=curriculumVitaeDao.findById(coverletterForCurriculumVitaeDto.getCurriculumId());

        curriculumVitae.setCoverLetter(coverletterForCurriculumVitaeDto.getCoverletter());
        curriculumVitaeDao.save(curriculumVitae);

        return new SuccessResult(Messages.Success);
    }

    @Override
    public CurriculumVitae findByJobSeekerId(int id) {
        return curriculumVitaeDao.findByJobSeekerId(id);
    }


}
