package com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ActorRepositorio {
    private ArrayList<Actor> actores = new ArrayList<>();

    public ActorRepositorio(){
        actores.add(new Actor(1L, "Nacho Ruiz", "Español"));
        actores.add(new Actor(2L, "Neymar Jr", "Portugués"));
        actores.add(new Actor(3L, "Mohammed Abdul", "Marroquí"));
    }

    public ArrayList<Actor> listarActores(){
        return actores;
    }

    public Actor añadirActor(Actor a){
        actores.add(a);
        return a;
    }
}
