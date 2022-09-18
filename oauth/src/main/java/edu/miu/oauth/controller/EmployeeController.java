package edu.miu.oauth.controller;

import edu.miu.oauth.entity.Employee;
import edu.miu.oauth.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    @RolesAllowed("admin")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }
}
