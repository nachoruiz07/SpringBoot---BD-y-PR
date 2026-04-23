package com.example.Nacho.Ruiz.Velasco.SpringBoot.Controlador;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Pelicula;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio.PeliculaServicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/peliculas")
public class PeliculaControlador {
    @Autowired
    private final PeliculaServicio peliculaServicio;

    @GetMapping("/listar")
    public List<Pelicula> obtenerTodas(){
    return peliculaServicio.listarTodosLasPeliculas();
    }

    @PostMapping("/crear")
    public Pelicula guardar (@RequestBody Pelicula pelicula){
    return  peliculaServicio.crearPelicula(pelicula);
    }

    @GetMapping("/buscar/{id}")
    public Pelicula buscarPelicula(@PathVariable Long id){
        return peliculaServicio.bucarPeliculaPorId(id);
    }

    @PutMapping("/modificar/{id}")
    public Pelicula modificarPelicula(@PathVariable Long id, @RequestBody Pelicula p){
        return peliculaServicio.actualizarPelicula(id, p);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarPelicula(@PathVariable Long id){
        peliculaServicio.borrarPeliculaPorId(id);
    }
    }