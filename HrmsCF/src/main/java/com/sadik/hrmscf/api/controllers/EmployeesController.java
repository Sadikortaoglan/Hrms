package com.sadik.hrmscf.api.controllers;

import com.sadik.hrmscf.business.abstracts.EmployeeService;
import com.sadik.hrmscf.business.constans.RestPathContants;
import com.sadik.hrmscf.entities.concretes.Employee;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = RestPathContants.ROOT_EMPLOYEE_PATH)
@CrossOrigin
public class EmployeesController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("add")
    public void add(@RequestBody Employee employee) {
        employeeService.add(employee);
    }

    @DeleteMapping
    public void delete(@RequestBody int id) {
        employeeService.delete(id);
    }

    @GetMapping
    public void get(@RequestBody int id) {
        employeeService.get(id);
    }
}
