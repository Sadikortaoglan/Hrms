package com.sadik.hrmscf.core.adapters;

import MernisService.UUJKPSPublicSoap;
import com.sadik.hrmscf.entities.concretes.JobSeeker;

public class MernisServiceAdapter {

    private static final UUJKPSPublicSoap uujkpsPublicSoap=new UUJKPSPublicSoap();



    public static boolean CheckIfRealPerson(JobSeeker jobSeeker) throws Exception {

        return uujkpsPublicSoap.TCKimlikNoDogrula(
                  Long.parseLong(jobSeeker.getIdentityNumber()),
                jobSeeker.getFirstName(),
                jobSeeker.getLastName(),
                jobSeeker.getDateOfBirth().getYear());
    }

}
