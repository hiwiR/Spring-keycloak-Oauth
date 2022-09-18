package edu.miu.oauth.service;

import edu.miu.oauth.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Employee getEmployee(Integer id);
}
