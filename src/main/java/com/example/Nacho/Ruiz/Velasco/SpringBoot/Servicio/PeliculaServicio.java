package com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Pelicula;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio.PeliculaRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PeliculaServicio {
    @Autowired
    PeliculaRepositorio peliculaRepositorio;


    //Crear
    public Pelicula crearPelicula(Pelicula pelicula){
        peliculaRepositorio.save(pelicula);
        return pelicula;
    }

    //Listar
    public List<Pelicula> listarTodosLasPeliculas(){
        return peliculaRepositorio.findAll();
    }

    //Buscar
    public Pelicula bucarPeliculaPorId(Long id){
        //Uso el orELse(null), porque el método me pide que especifique lo que debe hacer si no lo encuentra
        return peliculaRepositorio.findById(id).orElse(null);
    }

    //Borrar
    public void borrarPeliculaPorId(Long id){
        if(peliculaRepositorio.existsById(id)) {
            peliculaRepositorio.deleteById(id);
            System.out.println("SE HA BORRADO UN CLIENTE EN LA BASE DE DATOS");
        } else {
            System.out.println("ERROR, NO SE HA ENCONTRADO");
        }
    }

    //Actualizar
    public Pelicula actualizarPelicula(Long id, Pelicula peliculaNueva){
        Pelicula peliculaVieja = peliculaRepositorio.findById(id).orElse(null);
        //Con estos if, compruebo que los datos nuevos introducidos no sean nulls
        if(peliculaVieja != null) {
            if (peliculaNueva.getTitulo() != null) {
                peliculaVieja.setTitulo(peliculaNueva.getTitulo());
            }
            if (peliculaNueva.getGenero() != null) {
                peliculaVieja.setGenero(peliculaNueva.getGenero());
            }
            if (peliculaNueva.getAnio() != null) {
                peliculaVieja.setAnio(peliculaNueva.getAnio());
            }
        }else{
            return null;
        }
        return peliculaRepositorio.save(peliculaVieja);
    }
}

