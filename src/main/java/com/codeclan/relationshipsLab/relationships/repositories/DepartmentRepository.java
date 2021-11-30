package com.codeclan.relationshipsLab.relationships.repositories;

import com.codeclan.relationshipsLab.relationships.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
