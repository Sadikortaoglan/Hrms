package com.sadik.hrmscf.core.utilities.email;

import org.springframework.stereotype.Service;

@Service
public class FakeEmailManager implements FakeEmailService {
    @Override
    public String send(String email) {
    return email+"Gönderildi";
    }

    @Override
    public boolean check() {
        return true;
    }
}
