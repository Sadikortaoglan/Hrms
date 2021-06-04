package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.dtos.PictureWithUserDto;

public interface PictureService {

    Result addPicture(PictureWithUserDto pictureWithUserDto);

}
