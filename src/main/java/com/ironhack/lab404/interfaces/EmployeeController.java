package com.ironhack.lab404.interfaces;

import com.ironhack.lab404.clases.EmployeeDTO;
import com.ironhack.lab404.model.Employee;

public interface EmployeeController {
    void addEmployee(Employee employee);
    void updateEmployeeStatus(EmployeeDTO employeeDTO);
    void updateEmployeeDepartment(EmployeeDTO employeeDTO);
}
