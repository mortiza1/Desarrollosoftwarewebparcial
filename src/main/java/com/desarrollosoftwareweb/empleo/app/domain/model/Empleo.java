/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MOA
 */

package com.desarrollosoftwareweb.empleo.app.domain.model;

public class Empleo {
    private Long id;
    private String nombre;
    private String categoria;
    private String areaTrabajo;
    private String empresa;
    private String nivel;
    private Double sueldo;
    private String funciones;
    private String cargoJefe;

    // Constructor vacío
    public Empleo(){       
}
     // Constructor completo
    public Empleo(Long id, String nombre, String categoria, String areaTrabajo, String empresa,
                  String nivel, Double sueldo, String funciones, String cargoJefe) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.areaTrabajo = areaTrabajo;
        this.empresa = empresa;
        this.nivel = nivel;
        this.sueldo = sueldo;
        this.funciones = funciones;
        this.cargoJefe = cargoJefe;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public String getCargoJefe() {
        return cargoJefe;
    }

    public void setCargoJefe(String cargoJefe) {
        this.cargoJefe = cargoJefe;
    }
}
