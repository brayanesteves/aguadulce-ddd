package com.halconbit.aguasdulces.service;

import com.halconbit.aguasdulces.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> findAllEmployees();
    EmployeeDTO findEmployeeById(String id);
    void createEmployee(EmployeeDTO employeeDTO);
    void updateEmployee(String id, EmployeeDTO employeeDTO);
    void deleteEmployee(String id);
}
