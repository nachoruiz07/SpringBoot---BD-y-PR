package com.example.Nacho.Ruiz.Velasco.SpringBoot.Controlador;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Director;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio.DirectorServicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/directores")
public class DirectorControlador {
    @Autowired
    private final DirectorServicio directorServicio;

    @GetMapping("/listar")
    public List<Director> obtenerTodosDirectores(){
        return directorServicio.listarTodosLosDirectores();
    }

    @PostMapping("/crear")
    public Director guardarDirector(@RequestBody Director d){
        directorServicio.crearDirector(d);
        return d;
    }

    @GetMapping("/buscar/{id}")
    public Director buscarDirector(@PathVariable Long id){
        return directorServicio.bucarDirectorPorId(id);
    }

    @PutMapping("/modificar/{id}")
    public Director modificarDirector(@PathVariable Long id, @RequestBody Director d){
        return directorServicio.actualizarDirector(id, d);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarDirector(@PathVariable Long id){
        directorServicio.borrarDirectorPorId(id);
    }
}
