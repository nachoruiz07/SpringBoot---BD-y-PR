package com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Director;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Pelicula;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
   private final PeliculaRepositorio peliculaRepositorio;
   private final ActorRepositorio actorRepositorio;
   private final DirectorRepositorio directorRepositorio;

   public DataLoader(PeliculaRepositorio peliculaRepositorio, ActorRepositorio actorRepositorio, DirectorRepositorio directorRepositorio) {
       this.peliculaRepositorio = peliculaRepositorio;
       this.actorRepositorio = actorRepositorio;
       this.directorRepositorio = directorRepositorio;
   }

    @Override
    public void run(String... args) throws Exception {
        if (peliculaRepositorio.count() == 0) {
            // 2 Películas
            peliculaRepositorio.save(new Pelicula(null, "Matrix", "Ciencia Ficción", 1999));
            peliculaRepositorio.save(new Pelicula(null, "Inception", "Ciencia Ficción", 2010));
            peliculaRepositorio.save(new Pelicula(null, "Interstellar", "Ciencia Ficción", 2014));
            peliculaRepositorio.save(new Pelicula(null, "The Dark Knight", "Acción", 2008));
            peliculaRepositorio.save(new Pelicula(null, "Titanic", "Romance", 1997));
            peliculaRepositorio.save(new Pelicula(null, "Avatar", "Ciencia Ficción", 2009));
            peliculaRepositorio.save(new Pelicula(null, "Gladiator", "Acción", 2000));
            peliculaRepositorio.save(new Pelicula(null, "Jurassic Park", "Aventura", 1993));
            peliculaRepositorio.save(new Pelicula(null, "Forrest Gump", "Drama", 1994));
            peliculaRepositorio.save(new Pelicula(null, "The Shawshank Redemption", "Drama", 1994));

            // 2 Actores
            actorRepositorio.save(new Actor(null, "Keanu Reeves", "Libanés/Canadiense"));
            actorRepositorio.save(new Actor(null, "Leonardo DiCaprio", "Estadounidense"));
            actorRepositorio.save(new Actor(null, "Morgan Freeman", "Estadounidense"));
            actorRepositorio.save(new Actor(null, "Brad Pitt", "Estadounidense"));
            actorRepositorio.save(new Actor(null, "Angelina Jolie", "Estadounidense"));
            actorRepositorio.save(new Actor(null, "Tom Hanks", "Estadounidense"));
            actorRepositorio.save(new Actor(null, "Scarlett Johansson", "Estadounidense"));
            actorRepositorio.save(new Actor(null, "Robert Downey Jr.", "Estadounidense"));
            actorRepositorio.save(new Actor(null, "Natalie Portman", "Israelí/Estadounidense"));
            actorRepositorio.save(new Actor(null, "Christian Bale", "Británico"));

            // 2 Directores
            directorRepositorio.save(new Director(null, "Lana Wachowski", 58));
            directorRepositorio.save(new Director(null, "Christopher Nolan", 53));
            directorRepositorio.save(new Director(null, "Steven Spielberg", 77));
            directorRepositorio.save(new Director(null, "James Cameron", 69));
            directorRepositorio.save(new Director(null, "Quentin Tarantino", 61));
            directorRepositorio.save(new Director(null, "Martin Scorsese", 81));
            directorRepositorio.save(new Director(null, "Ridley Scott", 86));
            directorRepositorio.save(new Director(null, "Peter Jackson", 62));
            directorRepositorio.save(new Director(null, "David Fincher", 61));
            directorRepositorio.save(new Director(null, "Clint Eastwood", 94));

            System.out.println("✅ DATOS DE PRUEBA (PELIS, ACTORES, DIRECTORES) LISTOS");
        }
    }
}
