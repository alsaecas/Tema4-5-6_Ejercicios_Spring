package com.alsaecas.Tema456_Ejercicios_Spring.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {


    @GetMapping("/api/hello")
    public String helloWorld(){
        return "Hello World from Spring!!";
    }
}
