package com.ejemplo.apirest.springboot3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorPrueba {


    @GetMapping
    public String mensaje(){
        
        return "¡EXITO ISMAEL!!";

        
    }
    
}
