package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.UserService;
import com.sadik.hrmscf.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UsersController {
    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/getall")
    public List<User> getall(){
        return userService.getAll();
    }
    @GetMapping
    public void get(int id){
        userService.get(id);
    }
    @DeleteMapping
    public void delete(int id){
        userService.delete(id);
    }
}
