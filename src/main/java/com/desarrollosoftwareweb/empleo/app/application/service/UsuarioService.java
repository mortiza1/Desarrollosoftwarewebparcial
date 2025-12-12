/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MOA
 */
package com.desarrollosoftwareweb.empleo.app.application.service;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
     // Simulación temporal de almacenamiento en memoria
    private final List<String> usuarios = new ArrayList<>();

    public List<String> listarUsuarios() {
        return usuarios;
    }

    public void agregarUsuario(String nombre) {
        usuarios.add(nombre);
    }

    public boolean eliminarUsuario(String nombre) {
        return usuarios.remove(nombre);
    }
    
}
