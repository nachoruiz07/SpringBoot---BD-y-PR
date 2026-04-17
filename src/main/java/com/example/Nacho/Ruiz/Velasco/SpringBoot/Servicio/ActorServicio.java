package com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio.ActorRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ActorServicio {
    private final ActorRepositorio actorRepositorio;

    public List<Actor> obtenerTodosActores(){
        return actorRepositorio.listarActores();
    }

    public Actor guardarActor(Actor a){
        return actorRepositorio.añadirActor(a);
    }
}
