package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.dtos.PictureWithUserDto;
import org.springframework.web.multipart.MultipartFile;

public interface PictureService {

    Result add(PictureWithUserDto pictureWithUserDto, MultipartFile uploadFile);

}
