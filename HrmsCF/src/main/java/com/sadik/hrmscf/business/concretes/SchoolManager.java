package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.CurriculumVitaeService;
import com.sadik.hrmscf.business.abstracts.SchoolService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.SchoolDao;
import com.sadik.hrmscf.entities.concretes.School;
import com.sadik.hrmscf.entities.dtos.SchoolWithCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolManager implements SchoolService {
    private  SchoolDao schoolDao;
    private CurriculumVitaeService curriculumVitaeService;
    @Autowired
    public SchoolManager(SchoolDao schoolDao, CurriculumVitaeService curriculumVitaeService) {
        this.schoolDao = schoolDao;
        this.curriculumVitaeService = curriculumVitaeService;
    }

    @Override
    public Result schoolWithJobSeekerAdd(SchoolWithCurriculumVitaeDto schoolWithCurriculumVitaeDto) {
        School school=new School();

        school.setCurriculumVitae(curriculumVitaeService.findById(schoolWithCurriculumVitaeDto.getCurriculumId()));

        school.setSchoolName(schoolWithCurriculumVitaeDto.getSchoolName());
        school.setDepartment(schoolWithCurriculumVitaeDto.getDepartment());
        school.setStartedDate(schoolWithCurriculumVitaeDto.getStartedDate());

        if(!schoolWithCurriculumVitaeDto.isGraduationStatus()){
            school.setFinishedDate(schoolWithCurriculumVitaeDto.getFinishedDate());
        }
        else
        {
            school.setGraduationStatus(schoolWithCurriculumVitaeDto.isGraduationStatus());

        }
       this.schoolDao.save(school);
        return  new SuccessResult(Messages.Success);
    }
}
