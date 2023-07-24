package com.halconbit.aguasdulces.controller;

import com.halconbit.aguasdulces.dto.EmployeeDTO;
import com.halconbit.aguasdulces.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDTO>> findAllEmployees() {
        List<EmployeeDTO> employees = this.employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public EmployeeDTO findEmployeeById(@PathVariable String id) {
        return this.employeeService.findEmployeeById(id);
    }

    @PostMapping("/employee")
    public void createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        this.employeeService.createEmployee(employeeDTO);
    }

    @PutMapping("/employee/{id}")
    public void updateEmployee(@PathVariable String id, @RequestBody EmployeeDTO employeeDTO) {
        this.employeeService.updateEmployee(id, employeeDTO);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable String id) {
        this.employeeService.deleteEmployee(id);
    }
}
