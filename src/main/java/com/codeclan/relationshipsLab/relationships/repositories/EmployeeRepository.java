package com.codeclan.relationshipsLab.relationships.repositories;

import com.codeclan.relationshipsLab.relationships.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
