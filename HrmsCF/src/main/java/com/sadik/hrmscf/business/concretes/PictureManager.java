package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.PictureService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.PictureDao;
import com.sadik.hrmscf.entities.concretes.Picture;
import com.sadik.hrmscf.entities.dtos.PictureWithUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureManager implements PictureService {
    private PictureDao pictureDao;

    @Autowired
    public PictureManager(PictureDao pictureDao) {
        this.pictureDao = pictureDao;
    }

    @Override
    public Result addPicture(PictureWithUserDto pictureWithUserDto) {//aklıma hiç yatmadı buna bakmam lazım
        Picture picture=new Picture();
        picture.setId(pictureWithUserDto.getUserId());
        picture.setImagePath(pictureWithUserDto.getImagePath());
         pictureDao.save(picture);
         return new SuccessResult(Messages.Added);

    }
}
