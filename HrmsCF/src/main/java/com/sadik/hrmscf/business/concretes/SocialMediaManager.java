package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.CurriculumVitaeService;
import com.sadik.hrmscf.business.abstracts.SocialMediaService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.SocialMediaDao;
import com.sadik.hrmscf.entities.concretes.SocialMedia;
import com.sadik.hrmscf.entities.dtos.SocialMediaForCurriculumVitaeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SocialMediaManager implements SocialMediaService {

    private SocialMediaDao socialMediaDao;
    private CurriculumVitaeService curriculumVitaeService;

    @Autowired
    public SocialMediaManager(SocialMediaDao socialMediaDao,CurriculumVitaeService curriculumVitaeService) {
        this.socialMediaDao = socialMediaDao;
        this.curriculumVitaeService=curriculumVitaeService;
    }

    @Override
    public Result add(SocialMedia socialMedia) {
       socialMediaDao.save(socialMedia);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public Result SocialMediaWithJobSeeker(SocialMediaForCurriculumVitaeDto socialMediaForCurriculumVitaeDto) {
        SocialMedia socialMedia=new SocialMedia();

        socialMedia.setCurriculumVitae(curriculumVitaeService.findById(socialMediaForCurriculumVitaeDto.getCurriculumId()));
        socialMedia.setType(socialMediaForCurriculumVitaeDto.getType());
        socialMedia.setLink(socialMediaForCurriculumVitaeDto.getLink());

        this.socialMediaDao.save(socialMedia);
        return new SuccessResult(Messages.Success);

    }
}
