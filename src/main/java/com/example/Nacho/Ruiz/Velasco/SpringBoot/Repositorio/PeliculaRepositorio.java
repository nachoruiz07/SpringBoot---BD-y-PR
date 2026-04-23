package com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepositorio extends JpaRepository<Pelicula, Long> {
}
