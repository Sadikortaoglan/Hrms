package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.UserService;
import com.sadik.hrmscf.core.dataAccess.UserDao;
import com.sadik.hrmscf.core.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void get(int id) {
        userDao.deleteById(id);

    }

    @Override
    public void delete(int id) {
        userDao.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }


}
