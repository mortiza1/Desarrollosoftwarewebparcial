/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MOA
 */
package com.desarrollosoftwareweb.empleo.app.infrastructure.controller;

import com.desarrollosoftwareweb.empleo.app.domain.service.EmpleoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/empleos")
public class EmpleoController {

    private final EmpleoService empleoService;

    public EmpleoController(EmpleoService empleoService) {
        this.empleoService = new EmpleoService();
    }
    // Métodos futuros para manejar endpoints irán aquí
    
    @GetMapping
    public List<String> getEmpleos() {
        return empleoService.getEmpleos();
    }

    @PostMapping
    public String crearEmpleo(@RequestBody String nombre) {
        return empleoService.crearEmpleo(nombre);
    }

    @PutMapping("/{id}")
    public String actualizarEmpleo(@PathVariable int id, @RequestBody String nombre) {
        return empleoService.actualizarEmpleo(id, nombre);
    }

    @DeleteMapping("/{id}")
    public String eliminarEmpleo(@PathVariable int id) {
        return empleoService.eliminarEmpleo(id);
    }
}
