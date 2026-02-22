package com.ejercicios.ejercicio1.Services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicios.ejercicio1.DTO.MultaResponseDTO;
import com.ejercicios.ejercicio1.Entities.Multa;
import com.ejercicios.ejercicio1.repo.CiudadanoRepo;
import com.ejercicios.ejercicio1.repo.MultaRepo;

@Service
public class MultaService {

    @Autowired
    CiudadanoRepo ciudadanoRepo;
    @Autowired
    MultaRepo multaRepo;

    public double pagarMulta(Long idMulta) {
        try {

            Multa multa = multaRepo.findById(idMulta).get();
            if (multa.getEstado().equalsIgnoreCase("PENDIENTE")) {
                LocalDate fechaHoy = LocalDate.now();

                long diferencia = ChronoUnit.DAYS.between(multa.getFechaINfraccion(), fechaHoy);

                if (diferencia <= 20) {
                    double importe = multa.getImporte() * 0.5;
                    multa.setEstado("PAGADO");
                    multa.setImporte(importe);
                    multaRepo.save(multa);
                    
                    return importe;
                } else {
                    multa.setEstado("PAGADO");
                    multaRepo.save(multa);

                    return multa.getImporte();
                }
            }
            return 0;
        } catch (Exception e) {

            System.out.println("Ya se pago");
            return 0;
        }

    }

    public MultaResponseDTO toDtoMulta(Long idMulta) {
        try {
            Multa multa = multaRepo.findById(idMulta).get();
            return new MultaResponseDTO(
                    multa.getId(),
                    multa.getEstado(),
                    multa.getImporte());
        } catch (Exception e) {
            return null;
        }
    }

}
