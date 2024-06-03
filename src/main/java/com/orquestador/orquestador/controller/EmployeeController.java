package com.orquestador.orquestador.controller;

import com.orquestador.orquestador.dto.EmployeeDTO;
import com.orquestador.orquestador.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // get all employees
    @GetMapping("/employees")
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getEmployeeById();
    }

    // create employee rest api
    @PostMapping("/employees")
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employee) {
        return employeeService.guardarEmpleado(employee);
    }

}


