package com.sadik.hrmscf.core.verification;

import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class VerificationManager implements VerificationService{
    @Override
    public void sendLink(String email) {
        UUID uuid = UUID.randomUUID();
        String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
        System.out.println("Verification link has been sent to " + email );
        System.out.println("Please click on the link to verify your account:  " + verificationLink );
    }

    public String sendCode() {

        UUID uuid = UUID.randomUUID();
        String verificationCode = uuid.toString();
        System.out.println("Your activation code:  " + verificationCode );
        return verificationCode;
    }
}
