package com.example.Nacho.Ruiz.Velasco.SpringBoot.Controlador;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Pelicula;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio.PeliculaServicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/peliculas")
public class PeliculaControlador {
    private final PeliculaServicio servicioPelicula;

@GetMapping("/lista")
public List<Pelicula> obtenerTodas(){
return servicioPelicula.obtenerTodas();
}
@PostMapping("/guardar")
public Pelicula guardar (@RequestBody Pelicula pelicula){
return  servicioPelicula.guardar(pelicula);
    }
}