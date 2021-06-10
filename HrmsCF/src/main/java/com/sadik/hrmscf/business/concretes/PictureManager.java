package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.PictureService;
import com.sadik.hrmscf.business.abstracts.UserService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.adapters.cloudinary.CloudinaryService;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.PictureDao;
import com.sadik.hrmscf.entities.concretes.Picture;
import com.sadik.hrmscf.entities.dtos.PictureWithUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public class PictureManager implements PictureService {
    private final PictureDao pictureDao;
    private final CloudinaryService cloudinarService;
    private final UserService  userService;


    @Autowired
    public PictureManager(PictureDao pictureDao, CloudinaryService cloudinarService, UserService  userService) {
        this.pictureDao = pictureDao;
        this.cloudinarService = cloudinarService;
        this.userService = userService;
    }

    @Override
    public Result add(PictureWithUserDto pictureWithUserDto, MultipartFile uploadFile) {
     /*Map<String,String> uploadImage=this.cloudinarService.uploadImage(uploadFile).getData();
       pictureWithUserDto.setImagePath(uploadImage.get("url"));
       this.pictureDao.save(imagePath);*/

        Picture picture=new Picture();
        picture.setUser(userService.findById(pictureWithUserDto.getUserId()));
        @SuppressWarnings("unchecked")
        Map<String,String> uploadImage=cloudinarService.uploadImageFile(uploadFile).getData();
        picture.setImagePath(uploadImage.get("url"));

        this.pictureDao.save(picture);

        return new SuccessResult(Messages.Success);
    }

    }
