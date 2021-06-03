package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.entity.User;

import java.util.List;

public interface UserService {
    void get(int id);

    void delete(int id);

    List<User> getAll();

}
