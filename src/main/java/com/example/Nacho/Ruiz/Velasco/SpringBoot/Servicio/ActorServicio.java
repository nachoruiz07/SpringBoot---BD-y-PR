package com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio.ActorRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ActorServicio {
    @Autowired
    ActorRepositorio actorRepositorio;


    //Crear
    public Actor crearActor(Actor actor){
        actorRepositorio.save(actor);
        return actor;
    }

    //Listar
    public List<Actor> listarTodosLosActores(){
        return actorRepositorio.findAll();
    }

    //Buscar
    public Actor bucarActorPorId(long id){
        //Uso el orELse(null), porque el método me pide que especifique lo que debe hacer si no lo encuentra
        return actorRepositorio.findById(id).orElse(null);
    }

    //Borrar
    public void borrarActorPorId(Long id){
        if(actorRepositorio.existsById(id)) {
            actorRepositorio.deleteById(id);
            System.out.println("SE HA BORRADO UN CLIENTE EN LA BASE DE DATOS");
        } else {
            System.out.println("ERROR, NO SE HA ENCONTRADO");
        }
    }

    //Actualizar
    public Actor actualizarActor(Long id, Actor actorNuevo){
        Actor actorViejo = actorRepositorio.findById(id).orElse(null);
        //Con estos if, compruebo que los datos nuevos introducidos no sean nulls
        if(actorViejo != null) {
            if (actorNuevo.getNombre() != null) {
                actorViejo.setNombre(actorNuevo.getNombre());
            }
            if (actorNuevo.getNacionalidad() != null) {
                actorViejo.setNacionalidad(actorNuevo.getNacionalidad());
            }
        }else{
            return null;
        }
        return actorRepositorio.save(actorViejo);
    }
}