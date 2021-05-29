package com.sadik.hrmscf.core.utilities.security;

import java.util.regex.Pattern;

public class Regex {

    public static boolean verify(String email,String companyName) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        String[] array = companyName.split(" ");
        String finalString = "";
        for (String s : array) {
            finalString += s.toLowerCase();
        }
        String emailRegex = "info@"+finalString+".(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (pattern.matcher(email).matches()) {
            return true;
        } else {
            return false;
        }
    }
}
