package com.ejercicios.ejercicio1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicios.ejercicio1.Entities.Multa;

public interface MultaRepo extends JpaRepository<Multa,Long> {

}
