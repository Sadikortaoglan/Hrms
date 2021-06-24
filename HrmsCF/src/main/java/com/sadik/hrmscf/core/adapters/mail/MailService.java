package com.sadik.hrmscf.core.adapters.mail;

public interface MailService {
    void sendMail(String toEmail, String subject, String body);
}
