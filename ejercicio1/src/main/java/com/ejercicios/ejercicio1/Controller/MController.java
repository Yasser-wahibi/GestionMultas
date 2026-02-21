package com.ejercicios.ejercicio1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicios.ejercicio1.DTO.MultaResponseDTO;
import com.ejercicios.ejercicio1.Services.MultaService;

@RestController
@RequestMapping("/multas")
public class MController {

    @Autowired MultaService servicio;

    @PostMapping("{id}/pagar")
    public ResponseEntity<MultaResponseDTO> pagarMulta(@PathVariable Long id ){

        double num=servicio.pagarMulta(id);
        if(num==0){
            return ResponseEntity.badRequest().body(servicio.toDtoMulta(id));
        }
        return  ResponseEntity.ok().body(servicio.toDtoMulta(id));

      
    }
}
