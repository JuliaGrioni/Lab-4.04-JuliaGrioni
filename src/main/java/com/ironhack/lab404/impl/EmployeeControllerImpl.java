package com.ironhack.lab404.impl;

import com.ironhack.lab404.clases.EmployeeDTO;
import com.ironhack.lab404.interfaces.EmployeeController;
import com.ironhack.lab404.model.Employee;
import com.ironhack.lab404.model.Patient;
import com.ironhack.lab404.repository.EmployeeRepository;
import com.ironhack.lab404.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeControllerImpl implements EmployeeController {


    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employeesAdd")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody @Valid Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PatchMapping
    public void updateEmployeeStatus(EmployeeDTO employeeDTO) {
        employeeService.updateEmployeeStatus(employeeDTO);

    }

    @Override
    public void updateEmployeeDepartment(EmployeeDTO employeeDTO) {
        employeeService.updateEmployeeDepartment(employeeDTO);
    }
}
