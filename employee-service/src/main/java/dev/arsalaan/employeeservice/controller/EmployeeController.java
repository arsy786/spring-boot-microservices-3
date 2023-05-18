package dev.arsalaan.employeeservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.arsalaan.employeeservice.model.Employee;
import dev.arsalaan.employeeservice.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

  @Autowired
  EmployeeRepository employeeRepository;

  @PostMapping
  public Employee add(@RequestBody Employee employee) {
    LOGGER.info("Employee add: {}", employee);
    return employeeRepository.add(employee);
  }

  @GetMapping
  public List<Employee> findAll() {
    LOGGER.info("Employee find");
    return employeeRepository.findAll();
  }

  @GetMapping("/{id}")
  public Employee findById(@PathVariable("id") Long id) {
    LOGGER.info("Employee find: id={}", id);
    return employeeRepository.findById(id);
  }

  @GetMapping("/department/{departmentId}")
  public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId) {
    LOGGER.info("Employee find: departmentId={}", departmentId);
    return employeeRepository.findByDepartment(departmentId);
  }

}
