package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.CurriculumVitaeService;
import com.sadik.hrmscf.business.abstracts.WorkExperienceService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.WorkExperienceDao;
import com.sadik.hrmscf.entities.concretes.WorkExperience;
import com.sadik.hrmscf.entities.dtos.WorkExperienceForCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkExperienceManager implements WorkExperienceService {

    private WorkExperienceDao workExperienceDao;
    private CurriculumVitaeService curriculumVitaeService;

    @Autowired
    public WorkExperienceManager(WorkExperienceDao workExperienceDao,CurriculumVitaeService curriculumVitaeService) {
        this.workExperienceDao = workExperienceDao;
        this.curriculumVitaeService=curriculumVitaeService;
    }

    @Override
    public Result add(WorkExperience workExperience) {
        workExperienceDao.save(workExperience);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public Result delete(int id) {
        workExperienceDao.deleteById(id);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public Result workExperienceForJobSeekerAdd(WorkExperienceForCurriculumVitaeDto workExperienceForCurriculumVitaeDto) {
        WorkExperience workExperience = new WorkExperience();

        workExperience.setCurriculumVitae(curriculumVitaeService.findById(workExperienceForCurriculumVitaeDto.getCurriculumId()));
        workExperience.setCompanyName(workExperienceForCurriculumVitaeDto.getCompanyName());
        workExperience.setPosition(workExperienceForCurriculumVitaeDto.getPosition());
        workExperience.setStartedDate(workExperienceForCurriculumVitaeDto.getStartedDate());

        if (!workExperienceForCurriculumVitaeDto.isStillWork()) {
            workExperience.setFinishedDate(workExperienceForCurriculumVitaeDto.getFinishedDate());
        } else {
            workExperience.setStillWorking(workExperienceForCurriculumVitaeDto.isStillWork());
        }
        workExperienceDao.save(workExperience);
        return new SuccessResult(Messages.Success);
    }
}
