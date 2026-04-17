package com.example.Nacho.Ruiz.Velasco.SpringBoot.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludosPruebaRestController {

    @GetMapping({"/saludoPersonalizado/{nombre}", "/sP/{nombre}"})
    public String saludo(@PathVariable String nombre){
        return "Hola, "+nombre;
    }
}
