package com.halconbit.aguasdulces.service;

import com.halconbit.aguasdulces.dto.EmployeeDTO;
import com.halconbit.aguasdulces.entities.Employee;
import com.halconbit.aguasdulces.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDTO> findAllEmployees() {
        List<Employee> employees = this.employeeRepository.findAll();
        return employees.stream()
                .map(employee -> new EmployeeDTO(employee.getIdentification(), employee.getName(), employee.getAge(), employee.getPosition()))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO findEmployeeById(String id) {
        Optional<Employee> employeeOptional = this.employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            return new EmployeeDTO(employee.getIdentification(), employee.getName(), employee.getAge(), employee.getPosition());
        }
        return null;
    }

    @Override
    public void createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(employeeDTO.getIdentification(), employeeDTO.getName(), employeeDTO.getAge(), employeeDTO.getPosition());
        this.employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(String id, EmployeeDTO employeeDTO) {
        Optional<Employee> employeeOptional = this.employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            employee.setName(employeeDTO.getName());
            employee.setAge(employeeDTO.getAge());
            employee.setPosition(employeeDTO.getPosition());
            this.employeeRepository.save(employee);
        }
    }

    @Override
    public void deleteEmployee(String id) {
        this.employeeRepository.deleteById(id);
    }
}