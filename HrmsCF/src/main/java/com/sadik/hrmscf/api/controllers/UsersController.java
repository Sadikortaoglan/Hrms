package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.UserService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.entity.User;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<User> getall() {
        return userService.getAll();
    }

    @GetMapping
    public void get(int id) {
        userService.get(id);
    }

    @DeleteMapping
    public void delete(int id) {
        userService.delete(id);
    }

    @PostMapping("/add")
    public Result add(@RequestBody User user){
        return this.userService.add(user);
    }
}
