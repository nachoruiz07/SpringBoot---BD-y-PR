package com.example.Nacho.Ruiz.Velasco.SpringBoot.Dominio;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bd_peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    @NotBlank(message = "El título es obligatorio")
    private String titulo;
    @NotBlank(message = "El genero es obligatorio")
    @Size(min = 3)
    private String genero;
    @Min(1895)
    @Max(2030)
    private Integer anio;
    /**
    @Transient
    private String categoriaVisual;
    */
    }




