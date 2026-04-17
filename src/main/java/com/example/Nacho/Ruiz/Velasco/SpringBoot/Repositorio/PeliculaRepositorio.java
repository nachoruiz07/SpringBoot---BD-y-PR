package com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Pelicula;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PeliculaRepositorio {
    private ArrayList<Pelicula> peliculas = new ArrayList<>();

    public PeliculaRepositorio(){
        peliculas.add(new Pelicula(1L,"Pelicula1","Terror",2004));
        peliculas.add(new Pelicula(2L,"Pelicula2","Comedia",1995));
        peliculas.add(new Pelicula(3L,"Pelicula3","Acción",2022));
    }
    public ArrayList<Pelicula> listarPeliculas(){
        return peliculas;
    }
    public Pelicula addPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
        return pelicula;
    }
}
