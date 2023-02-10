package com.ironhack.lab404.serviceimpl;

import com.ironhack.lab404.clases.EmployeeDTO;
import com.ironhack.lab404.enums.Status;
import com.ironhack.lab404.model.Employee;
import com.ironhack.lab404.repository.EmployeeRepository;
import com.ironhack.lab404.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;



    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }


    public void updateEmployeeStatus(EmployeeDTO employeeDTO) {
        Optional<Employee> employee = employeeRepository.findById(employeeDTO.getEmployeeId());
        employeeDTO.setStatus(Status.ON);
        employeeRepository.save(employee.get());
    }


    public void updateEmployeeDepartment(EmployeeDTO employeeDTO) {
        Optional<Employee> employee = employeeRepository.findById(employeeDTO.getEmployeeId());
        employeeDTO.setDepartment(employeeDTO.getDepartment());
        employeeRepository.save(employee.get());
    }


    //@PatchMapping("/courses/{employeeId}/name")
    //@ResponseStatus(HttpStatus.NO_CONTENT)
    //public void changeEmployeeStatus(@PathVariable int employeeId, @RequestBody @Valid EmployeeNameDTO employeeNameDTO) {
      //  employeeRepository.changeEmployeeStatus(employeeId, employeeNameDTO);
    //}

}
