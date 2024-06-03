package com.orquestador.orquestador.service;

import com.orquestador.orquestador.client.EmployeeClient;
import com.orquestador.orquestador.dto.EmployeeDTO;
import com.orquestador.orquestador.dto.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeClient employeeClient;

    public List<EmployeeDTO> getEmployeeById() {
        List<EmployeeDTO> listaEmpleado = employeeClient.getEmployees();
        return listaEmpleado;
    }

    public EmployeeDTO guardarEmpleado(EmployeeDTO empleado){
        EmployeeDTO empleadoDTO = employeeClient.addEmployee(empleado);
        return empleadoDTO;
    }

}
