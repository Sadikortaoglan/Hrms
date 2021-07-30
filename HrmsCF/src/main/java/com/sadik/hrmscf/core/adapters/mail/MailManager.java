package com.sadik.hrmscf.core.adapters.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailManager implements MailService {
    @Autowired
    private JavaMailSender javaMailSender;


    @Override
    public void sendMail(String toEmail, String subject, String body) {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setFrom("hrms@gmail.com");
        simpleMailMessage.setTo(toEmail);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(body);
        System.out.println("send email");

        javaMailSender.send(simpleMailMessage);
    }
}
