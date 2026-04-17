package com.example.Nacho.Ruiz.Velasco.SpringBoot.Controlador;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio.ActorServicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/actores")
public class ActorControlador {
    private final ActorServicio actorServicio;
    @GetMapping("/listar")
    public List<Actor> obtenerTodosActores(){
        return actorServicio.obtenerTodosActores();
    }

    @PostMapping("/guardar")
    public Actor guardarActor(@RequestBody Actor a){
        actorServicio.guardarActor(a);
        return a;
    }
}
