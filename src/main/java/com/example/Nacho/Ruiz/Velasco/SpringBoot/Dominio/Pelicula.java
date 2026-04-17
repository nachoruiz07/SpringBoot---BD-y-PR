package com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pelicula {
    private long id;
    private String titulo;
    private String genero;
    private int anio;
    }




