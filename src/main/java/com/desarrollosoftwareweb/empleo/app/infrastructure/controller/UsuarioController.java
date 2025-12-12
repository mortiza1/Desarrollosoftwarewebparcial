/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MOA
 */

package com.desarrollosoftwareweb.empleo.app.infrastructure.controller;

import com.desarrollosoftwareweb.empleo.app.domain.service.UsuarioService;

public class UsuarioController {
        private final UsuarioService usuarioService;

    public UsuarioController() {
        this.usuarioService = new UsuarioService();
    }
}
