package com.ejercicios.ejercicio1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicios.ejercicio1.Entities.Ciudadano;

public interface CiudadanoRepo extends JpaRepository<Ciudadano, String>{

}
