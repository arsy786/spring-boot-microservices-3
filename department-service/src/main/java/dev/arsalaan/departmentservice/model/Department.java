package dev.arsalaan.departmentservice.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

  private Long id;
  private String name;
  private List<Employee> employees = new ArrayList<>();

  public Department() {
  }

  public Department(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", name='" + getName() + "'" +
        ", employees='" + getEmployees() + "'" +
        "}";
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Employee> getEmployees() {
    return this.employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

}
