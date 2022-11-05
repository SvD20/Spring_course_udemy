package com.zaurtregulov.spring.springboot.spring_course_springboot.dao;

import com.zaurtregulov.spring.springboot.spring_course_springboot.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    //void saveEmployee(Employee employee);

    //Employee getEmployee(int id);

    //void deleteEmployee(int id);
}
