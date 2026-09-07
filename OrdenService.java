package com.eventpass.ordenes.service;

import org.springframework.stereotype.Service;

@Service
public class OrdenService {

    public String crearOrden(Long usuarioId, Long eventoId) {
        // Registra la orden como ACEPTADA_PENDIENTE_EMISION
        // Luego la envía a Amazon SQS
        return "Orden creada y enviada a la cola SQS";
    }
}
