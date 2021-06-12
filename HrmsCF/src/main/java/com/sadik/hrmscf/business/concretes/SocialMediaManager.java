package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.CurriculumVitaeService;
import com.sadik.hrmscf.business.abstracts.SocialMediaService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.SocialMediaDao;
import com.sadik.hrmscf.entities.concretes.SocialMedia;
import com.sadik.hrmscf.entities.dtos.SocialMediaForCurriculumVitaeDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SocialMediaManager implements SocialMediaService {

    private SocialMediaDao socialMediaDao;
    private final ModelMapper modelMapper;
    @Autowired
    public SocialMediaManager(SocialMediaDao socialMediaDao,
                              ModelMapper modelMapper)
    {
        this.socialMediaDao = socialMediaDao;
        this.modelMapper=modelMapper;
    }

    @Override
    public Result add(SocialMedia socialMedia) {
       socialMediaDao.save(socialMedia);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public Result SocialMediaWithJobSeeker(SocialMediaForCurriculumVitaeDto socialMediaForCurriculumVitaeDto) {
    SocialMedia socialMedia=modelMapper.map(socialMediaForCurriculumVitaeDto,SocialMedia.class);

        this.socialMediaDao.save(socialMedia);
        return new SuccessResult(Messages.Success);

    }
}
