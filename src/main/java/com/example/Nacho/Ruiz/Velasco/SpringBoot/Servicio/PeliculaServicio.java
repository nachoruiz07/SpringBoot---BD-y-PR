package com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Pelicula;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio.PeliculaRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PeliculaServicio {
    private final PeliculaRepositorio repositorioPelicula;

    public List<Pelicula> obtenerTodas(){
        return repositorioPelicula.listarPeliculas();
    }
    public  Pelicula guardar(Pelicula pelicula){
        return  repositorioPelicula.addPelicula(pelicula);
    }
}
