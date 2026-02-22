package com.ejercicios.ejercicio1.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Ciudadano {

    @Id
    private String dni;
    
    private String nombre;

    private String email;
 
    @OneToMany(mappedBy = "ciudadano")
    private List<Multa> multas;
}
