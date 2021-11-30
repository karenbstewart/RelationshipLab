package com.codeclan.relationshipsLab.relationships.models;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private int employeeNum;
    private List<Project> projectList;

    public Employee(String firstName, String lastName, int employeeNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNum = employeeNum;
        this.projectList = new ArrayList<>();

    }

    public Employee(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }
}
