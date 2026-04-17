package com.example.Nacho.Ruiz.Velasco.SpringBoot.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromoControlador {


    @GetMapping("/palindromo/{palabra}")
    public String palindromo(@PathVariable String palabra){
        if(esPalindromo(palabra)) {
            return "La palabra: "+palabra+" SÍ es un palíndromo";
        }
        return "La palabra: "+palabra+" NO es un palíndromo";
    }

    public boolean esPalindromo(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
