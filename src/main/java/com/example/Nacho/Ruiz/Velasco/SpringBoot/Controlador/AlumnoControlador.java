package com.example.Nacho.Ruiz.Velasco.SpringBoot.Controlador;

import com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio.Alumnos;
import org.springframework.web.bind.annotation.*;

import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class AlumnoControlador {

    ArrayList<Alumnos> alumnosArrayList = new ArrayList<>(Arrays.asList(
            new Alumnos ("Nacho","Ruiz",18),
            new Alumnos ("Pepe","Fernández",17),
            new Alumnos ("Sara","León",19)
    ));

    // Con las llaves dentro del paréntesis del GetMapping puedo añadir más de una ruta para ejecutar el método
    @GetMapping({"/alumnoCompleto", "/aC"})
    public ArrayList<Alumnos> obtenerAlumno() {
        return alumnosArrayList;
    }

    @GetMapping("/alumno/{nombre}")
    // Se debería buscar por un id, pero es una prueba
    public Alumnos getAlumno(@PathVariable String nombre){
        for(Alumnos a : alumnosArrayList){
            if(a.getNombre().equalsIgnoreCase(nombre)){
                return a;
            }
        }
        return null;
    }
    //AÑADIR ALGO
    @PostMapping({"/alumnoCompleto", "/aC"})
    public Alumnos postAlumnos(@RequestBody Alumnos a){
        alumnosArrayList.add(a);
        return a;
    }

    //MODIFICAR ALGO QUE YA ESTÁ
    @PutMapping("/alumnoCompleto")
    // Lo correcto sería hacerlo con ids
    public Alumnos putAlumnos(@RequestBody Alumnos a){
        for(Alumnos al: alumnosArrayList){
            // Se debería comparar el ID, para así este no cambiarlo y solo cambiar otro tipo de info (como el nombre)
            if(al.getNombre().equalsIgnoreCase(a.getNombre())){
                al.setNombre(a.getNombre());
                al.setApellido(a.getApellido());
                al.setEdad(a.getEdad());
                return al;
            }
        }
        return null;
    }
    @DeleteMapping("/alumnoDELETE/{nombre}")
    public Alumnos deleteAlumnos(@PathVariable String nombre){
        // ESTO ESTA MUY MAL HECHO PORQUE AL SER CON EL NOMBRE BORRARÍA TODOS LOS QUE SE LLAMEN ASÍ, PERO COMO ES UNA
        // PRUEBA ME DA PEREZA CAMBIAR TODO OTRA VEZ ASÍ QUE NO PASA NADA
        for (Alumnos al : alumnosArrayList){
            if(al.getNombre().equalsIgnoreCase(nombre)){
                alumnosArrayList.remove(al);
                return al;
            }
        }
        return null;
    }
    @PatchMapping("/alumnoCompleto")
    public Alumnos patchAlumnos(@RequestBody Alumnos a){
        for (Alumnos al : alumnosArrayList){
            if(a.getNombre() != null){
            al.setNombre(a.getNombre());
            }
            if(a.getApellido() != null){
            al.setApellido(a.getApellido());
            }
            /**
            if(a.getEdad() != null){
            a.setEdad(al.getEdad());
            }
         **/
        }
        return a;
    }
}
