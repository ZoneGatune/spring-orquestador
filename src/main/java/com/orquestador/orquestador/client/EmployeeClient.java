package com.orquestador.orquestador.client;

import com.orquestador.orquestador.dto.EmployeeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "EmployeeClient", url = "http://localhost:8080/api/v1")
public interface EmployeeClient {

    @GetMapping("/employees")
    public List<EmployeeDTO> getEmployees();

    @PostMapping("/employees")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employee);
}
