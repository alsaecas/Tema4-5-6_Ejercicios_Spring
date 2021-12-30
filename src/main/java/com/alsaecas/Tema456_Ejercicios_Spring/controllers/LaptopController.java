package com.alsaecas.Tema456_Ejercicios_Spring.controllers;


import com.alsaecas.Tema456_Ejercicios_Spring.entities.Laptop;
import com.alsaecas.Tema456_Ejercicios_Spring.repositories.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    // atributos
    private LaptopRepository laptopRepository;
    // contructores
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }


    // recuperar y devolver los laptops de base de datos
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    //añadir nuevos laptops
    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers){
        // guardar el laptop recibido por parámetro en la base de datos
        return laptopRepository.save(laptop);
    }


}
