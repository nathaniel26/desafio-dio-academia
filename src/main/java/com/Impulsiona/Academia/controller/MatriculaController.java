package com.Impulsiona.Academia.controller;

import com.Impulsiona.Academia.model.Matricula;
import com.Impulsiona.Academia.model.form.MatriculaForm;
import com.Impulsiona.Academia.service.impl.MatriculaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }



}
