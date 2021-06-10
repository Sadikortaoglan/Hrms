package com.sadik.hrmscf.core.adapters.cloudinary;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import org.springframework.web.multipart.MultipartFile;


import java.util.Map;

public interface CloudinaryService {

    DataResult<Map> uploadImageFile(MultipartFile multipartFile);
}
