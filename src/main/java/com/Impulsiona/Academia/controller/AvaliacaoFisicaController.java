package com.Impulsiona.Academia.controller;

import com.Impulsiona.Academia.model.AvaliacaoFisica;
import com.Impulsiona.Academia.model.form.AvaliacaoFisicaForm;
import com.Impulsiona.Academia.service.impl.AvaliacaoFisicaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoFisicaController {
    @Autowired
    private AvaliacaoFisicaServiceImpl service;
    @PostMapping
    public AvaliacaoFisica creat(@Valid @RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }


}
