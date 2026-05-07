package com.example.Nacho.Ruiz.Velasco.SpringBoot;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Pelicula;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio.ActorRepositorio;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio.PeliculaRepositorio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("test")
class NachoRuizVelascoSpringBootApplicationTests {

	@Autowired
	private PeliculaRepositorio peliculaRepositorio;

	@Autowired
	private ActorRepositorio actorRepositorio;

	@Test
	public void creacionTEST(){
		Pelicula pelicula = new Pelicula(null, "Pelicula TEST", "Miedo", 2026);

		Pelicula pelicula_saved = peliculaRepositorio.save(pelicula);

		assertNotNull(pelicula_saved.getId(), "La pelicula no se ha encontrado");

		assertEquals ("Pelicula TEST",pelicula_saved.getTitulo());

		assertNotEquals(0, pelicula_saved.getId(), "Mal id");

		assertInstanceOf(Long.class, pelicula_saved.getId(), "Debe ser LONG el ID");
	}

	@Test
	public void crearActorTEST(){
		Actor actor = new Actor(null, "Tom Hanks", "Estadounidense");

		Actor actor_saved = actorRepositorio.save(actor);

		assertNotNull(actor_saved.getId(), "El actor tiene null el ID");

		assertEquals ("Tom Hanks",actor_saved.getNombre(), "El nombre no coincide");

		assertNotNull(actor_saved.getId(), "El actor tiene null el ID");

		assertTrue(actor_saved.getId() > 0, "El actor no tiene ID positivo");

	}
}
