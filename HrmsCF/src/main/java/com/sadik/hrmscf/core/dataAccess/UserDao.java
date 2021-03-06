package com.sadik.hrmscf.core.dataAccess;

import com.sadik.hrmscf.core.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

    User findByEmailAndPasswordHash(String email,String password);
    User findById(int id);
}
