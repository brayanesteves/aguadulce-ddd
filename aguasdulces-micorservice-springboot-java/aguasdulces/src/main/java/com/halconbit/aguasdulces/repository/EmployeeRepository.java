package com.halconbit.aguasdulces.repository;

import com.halconbit.aguasdulces.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
