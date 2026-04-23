package com.example.Nacho.Ruiz.Velasco.SpringBoot.Controlador;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio.ActorServicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/actores")
public class ActorControlador {
    @Autowired
    private final ActorServicio actorServicio;

    @GetMapping("/listar")
    public List<Actor> obtenerTodosActores(){
        return actorServicio.listarTodosLosActores();
    }

    @PostMapping("/crear")
    public Actor guardarActor(@RequestBody Actor a){
        actorServicio.crearActor(a);
        return a;
    }

    @GetMapping("/buscar/{id}")
    public Actor buscarActor(@PathVariable Long id){
        return actorServicio.bucarActorPorId(id);
    }

    @PutMapping("/modificar/{id}")
    public Actor modificarActor(@PathVariable Long id, @RequestBody Actor a){
       return actorServicio.actualizarActor(id, a);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarActor(@PathVariable Long id){
        actorServicio.borrarActorPorId(id);
    }
}
