package com.ejercicios.ejercicio1.Entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Multa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double importe;

    private LocalDate fechaINfraccion;

    private String estado;

    @ManyToOne
    @JoinColumn(name = "ciudadano_dni")
    private Ciudadano ciudadano;

}
