package com.codeclan.relationshipsLab.relationships;

import com.codeclan.relationshipsLab.relationships.models.Department;
import com.codeclan.relationshipsLab.relationships.models.Employee;
import com.codeclan.relationshipsLab.relationships.repositories.DepartmentRepository;
import com.codeclan.relationshipsLab.relationships.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RelationshipsApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void creatmodels(){
		Department department = new Department("the IT Crowd");
		departmentRepository.save(department);
		Employee Moss = new Employee("Moss", "whatshisface", 234, department);
		employeeRepository.save(Moss);
	}

}
