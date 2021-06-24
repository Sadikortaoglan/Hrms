package com.sadik.hrmscf.core.utilities.business;

public class BusinessRules {



    public static boolean isFieldsEntered(String... fields) {
        for (String s : fields) {
            if (s.isEmpty()) {
                return true;
            }
        }
        return false;
    }

}
