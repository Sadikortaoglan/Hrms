package com.sadik.hrmscf.business.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;


public class AppConfig {
    public static Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "sadikortaoglan",
            "api_key", "428171714582625",
            "api_secret", "oUn1N3xLF22bV0pvZyQdVwzyIvI"));
}
