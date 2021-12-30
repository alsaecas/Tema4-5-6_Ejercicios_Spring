package com.alsaecas.Tema456_Ejercicios_Spring.repositories;

import com.alsaecas.Tema456_Ejercicios_Spring.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
