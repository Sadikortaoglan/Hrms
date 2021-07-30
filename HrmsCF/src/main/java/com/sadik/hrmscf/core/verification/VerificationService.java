package com.sadik.hrmscf.core.verification;



public interface VerificationService {
    void sendLink(String email);
    String sendCode();
}
