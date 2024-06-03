package com.orquestador.orquestador.dto;

public class EmployeeDTO {

    private long id;

    private String nombre;

    private Integer dni;


    public EmployeeDTO() {

    }

    public EmployeeDTO(String nombre, Integer dni) {
        super();
        this.nombre = nombre;
        this.dni = dni;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
}