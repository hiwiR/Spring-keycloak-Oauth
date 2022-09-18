package edu.miu.oauth.service.impl;

import edu.miu.oauth.entity.Employee;
import edu.miu.oauth.repository.EmployeeRepository;
import edu.miu.oauth.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostConstruct
    public void initalizeEmployeeTable(){
        employeeRepository.saveAll(
                Stream.of(
                        new Employee( 1,"Kidist"),
                        new Employee(2,"Hiwot")
                ).collect(Collectors.toList())
        );
    }

    public List<Employee> getAllEmployee(){
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee getEmployee(Integer id){
        return employeeRepository.findById(id).orElse(null) ;
    }
}
