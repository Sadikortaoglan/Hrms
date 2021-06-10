package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.entity.User;
import com.sadik.hrmscf.core.utilities.result.Result;

import java.util.List;

public interface UserService {
    void get(int id);

    void delete(int id);

    List<User> getAll();

    Result add(User user);
    boolean findByEmailAndPasswordHash(String email, String password);
    User findById(int id);

}
