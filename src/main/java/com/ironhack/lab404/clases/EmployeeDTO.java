package com.ironhack.lab404.clases;

import com.ironhack.lab404.enums.Status;

public class EmployeeDTO {
    private Status status;
    private int employeeId;
    private String department;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
