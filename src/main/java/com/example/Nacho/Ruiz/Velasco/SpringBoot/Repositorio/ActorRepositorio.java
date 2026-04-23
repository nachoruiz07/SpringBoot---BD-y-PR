package com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepositorio extends JpaRepository<Actor, Long> {
}
