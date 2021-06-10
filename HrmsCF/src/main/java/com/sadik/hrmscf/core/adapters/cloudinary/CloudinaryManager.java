package com.sadik.hrmscf.core.adapters.cloudinary;

import com.cloudinary.utils.ObjectUtils;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.ErrorDataResult;
import com.sadik.hrmscf.core.utilities.result.SuccessDataResult;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import static com.sadik.hrmscf.business.config.AppConfig.cloudinary;

import java.io.IOException;
import java.util.Map;
@Service
public class CloudinaryManager implements CloudinaryService {

    @Override
    public DataResult<Map> uploadImageFile(MultipartFile imageFile) {

        try {

            @SuppressWarnings("unchecked")//Derleyici Uyarı hatası
            Map<String,String> resultMap =(Map<String,String>)cloudinary.uploader().upload(imageFile.getBytes(),ObjectUtils.emptyMap());

            return new SuccessDataResult<>(resultMap);

        } catch (IOException e) {
            e.printStackTrace();

        }
        return new ErrorDataResult<>();
    }
}
