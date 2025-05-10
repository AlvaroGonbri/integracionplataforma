package com.rrhh.gestion.controller;


import com.rrhh.gestion.entity.Comuna;
import com.rrhh.gestion.repository.ComunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/comunas/")
public class ComunaController {
    @Autowired
    private ComunaRepository comunaRepository;

    //Comienza el "mapeo"
    @GetMapping
    public List<Comuna> leerComunas() {
        return comunaRepository.findAll();
    }
}