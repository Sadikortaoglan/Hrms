package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.PictureService;
import com.sadik.hrmscf.business.constans.RestPathContants;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.dtos.PictureWithUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(path = RestPathContants.ROOT_PICTURE_PATH)
@CrossOrigin
public class PictureController {

    private PictureService pictureService;

    @Autowired
    public PictureController(PictureService pictureService) {
        this.pictureService = pictureService;
    }

    @PostMapping("/add")
    public Result add(@ModelAttribute MultipartFile multipartFile,PictureWithUserDto pictureWithUserDto){
        return this.pictureService.add(pictureWithUserDto, multipartFile);
    }
}
