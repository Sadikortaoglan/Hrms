package com.sadik.hrmscf.dataAccess.abstracts;


import com.sadik.hrmscf.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {


}
