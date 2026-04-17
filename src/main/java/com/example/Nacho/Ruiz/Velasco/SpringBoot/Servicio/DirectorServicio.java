package com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Director;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio.ActorRepositorio;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio.DirectorRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DirectorServicio {
    private final DirectorRepositorio directorRepositorio;

    public List<Director> obtenerTodosDirectores(){
        return directorRepositorio.listarDirectores();
    }

    public Director guardarDirector(Director d){
        return directorRepositorio.añadirDirector(d);
    }
}
