package com.zaurtregulov.spring.mvc_hibernate_aop.controller;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;
import com.zaurtregulov.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps",allEmployees);
        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "employee-info";
    }

    @RequestMapping("/SortImployeeMax")
    public String SortImployeeMax(Model model){

        List<Employee> allEmployees = employeeService.getAllEmployees();
        for(int i = 0; i < allEmployees.size() ;i++)
        {
            for (int j = 0; j < allEmployees.size() - 1 ;j++)
            {
                if(allEmployees.get(j).getSalary() > allEmployees.get(j+1).getSalary())
                {
                    Employee max = allEmployees.get(j);
                    allEmployees.set(j, allEmployees.get(j+1)) ;
                    allEmployees.set(j+1, max);
                }
            }
        }
        model.addAttribute("allEmps",allEmployees);

        return "all-employees";
    }

    @RequestMapping("/SortImployeeMin")
    public String SortImployeeMin(Model model){

        List<Employee> allEmployees = employeeService.getAllEmployees();
        for(int i = 0; i < allEmployees.size() ;i++)
        {
            for (int j = 0; j < allEmployees.size() - 1 ;j++)
            {
                if(allEmployees.get(j).getSalary() < allEmployees.get(j+1).getSalary())
                {
                    Employee min = allEmployees.get(j);
                    allEmployees.set(j, allEmployees.get(j+1)) ;
                    allEmployees.set(j+1, min);
                }
            }
        }
        model.addAttribute("allEmps",allEmployees);

        return "all-employees";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){

        employeeService.saveEmployee(employee);

        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model){

        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee",employee);

        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id){

        employeeService.deleteEmployee(id);

        return "redirect:/";
    }


}
