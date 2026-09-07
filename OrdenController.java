package com.eventpass.ordenes.controller;

import com.eventpass.ordenes.service.OrdenService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ordenes")
public class OrdenController {

    private final OrdenService ordenService;

    public OrdenController(OrdenService ordenService) {
        this.ordenService = ordenService;
    }

    @PostMapping
    public String crearOrden(@RequestParam Long usuarioId, @RequestParam Long eventoId) {
        return ordenService.crearOrden(usuarioId, eventoId);
    }
}
