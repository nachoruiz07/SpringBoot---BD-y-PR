package com.example.Nacho.Ruiz.Velasco.SpringBoot.Servicio;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Actor;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Director;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio.ActorRepositorio;
import com.example.Nacho.Ruiz.Velasco.SpringBoot.Repositorio.DirectorRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DirectorServicio {
    @Autowired
    DirectorRepositorio directorRepositorio;


    //Crear
    public Director crearDirector(Director director){
        directorRepositorio.save(director);
        return director;
    }

    //Listar
    public List<Director> listarTodosLosDirectores(){
        return directorRepositorio.findAll();
    }

    //Buscar
    public Director bucarDirectorPorId(Long id){
        //Uso el orELse(null), porque el método me pide que especifique lo que debe hacer si no lo encuentra
        return directorRepositorio.findById(id).orElse(null);
    }

    //Borrar
    public void borrarDirectorPorId(Long id){
        if(directorRepositorio.existsById(id)) {
            directorRepositorio.deleteById(id);
            System.out.println("SE HA BORRADO UN CLIENTE EN LA BASE DE DATOS");
        } else {
            System.out.println("ERROR, NO SE HA ENCONTRADO");
        }
    }

    //Actualizar
    public Director actualizarDirector(Long id, Director directorNuevo){
        //Creo un cliente auxiliar, simulando el que había antes del cambio, y le contribuyo la id introducida
        Director directorViejo = directorRepositorio.findById(id).orElse(null);
        //Con estos if, compruebo que los datos nuevos introducidos no sean nulls
        if(directorViejo != null) {
            if (directorNuevo.getNombre() != null) {
                directorViejo.setNombre(directorNuevo.getNombre());
            }
            if (directorNuevo.getEdad() != null) {
                directorViejo.setEdad(directorNuevo.getEdad());
            }
        }else{
            return null;
        }
        return directorRepositorio.save(directorViejo);
    }
}

