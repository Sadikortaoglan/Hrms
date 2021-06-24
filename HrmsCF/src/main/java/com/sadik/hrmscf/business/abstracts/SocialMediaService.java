package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.SocialMedia;
import com.sadik.hrmscf.entities.dtos.SocialMediaForCurriculumVitaeDto;
import java.util.List;
public interface SocialMediaService {


    Result add(SocialMedia socialMedia);
    Result SocialMediaWithJobSeeker(SocialMediaForCurriculumVitaeDto socialMediaForCurriculumVitaeDto);

    DataResult<List<SocialMedia>> getall();

}
