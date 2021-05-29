package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.EmployeeService;
import com.sadik.hrmscf.dataAccess.abstracts.EmployeeDao;
import com.sadik.hrmscf.entities.concretes.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {
    private EmployeeDao employeeDao;
    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }



    @Override
    public void add(Employee employee) {
        employeeDao.save(employee);

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Employee get(int id) {
        return null;
    }

    @Override
    public List<Employee> getMultiple(List<Integer> id) {
        return null;
    }
}
