package com.eventpass.ordenes.model;

import jakarta.persistence.*;

@Entity
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long usuarioId;
    private Long eventoId;
    private String estado; // ACEPTADA_PENDIENTE_EMISION, EMITIDA, RECHAZADA

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public Long getEventoId() { return eventoId; }
    public void setEventoId(Long eventoId) { this.eventoId = eventoId; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
