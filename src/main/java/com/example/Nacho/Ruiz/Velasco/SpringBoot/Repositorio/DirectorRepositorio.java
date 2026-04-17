package com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Director;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio.DirectorServicio;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DirectorRepositorio {
    private ArrayList<Director> directores = new ArrayList<>();

    public DirectorRepositorio(){
        directores.add(new Director(1L, "Pepe Canales", 11));
        directores.add(new Director(2L, "Alberto Ruiz", 56));
        directores.add(new Director(3L, "Harry Potter", 37));
    }

    public ArrayList<Director> listarDirectores(){
        return directores;
    }

    public Director añadirDirector(Director d){
        directores.add(d);
        return d;
    }
}
