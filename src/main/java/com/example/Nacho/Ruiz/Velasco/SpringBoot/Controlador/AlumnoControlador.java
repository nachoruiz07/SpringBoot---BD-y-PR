package com.example.Nacho.Ruiz.Velasco.SpringBoot.Controlador;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Alumnos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoControlador {

    @GetMapping("/alumno")
    public Alumnos obtenerAlumno() {
        return new Alumnos("Nacho", "Ruiz", 25);
    }
}
