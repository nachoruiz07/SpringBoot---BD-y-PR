package com.example.Nacho.Ruiz.Velasco.SpringBoot.Controlador;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Director;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio.DirectorServicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/directores")
public class DirectorControlador {
    private final DirectorServicio directorServicio;
    @GetMapping("/listar")
    public List<Director> obtenerTodosDirectores(){
        return directorServicio.obtenerTodosDirectores();
    }

    @PostMapping("/guardar")
    public Director guardarDirector(@RequestBody Director d){
        directorServicio.guardarDirector(d);
        return d;
    }
}
