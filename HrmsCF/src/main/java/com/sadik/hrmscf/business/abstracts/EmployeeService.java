package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    void add(Employee employee);
    void delete(int id);
    Employee get(int id);
    List<Employee> getMultiple(List<Integer> id);
}
