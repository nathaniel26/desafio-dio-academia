package com.Impulsiona.Academia.controller;

import com.Impulsiona.Academia.model.Aluno;
import com.Impulsiona.Academia.model.AvaliacaoFisica;
import com.Impulsiona.Academia.model.form.AlunoForm;
import com.Impulsiona.Academia.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Aluno criarAluno(@Valid @RequestBody AlunoForm form){
        return service.creat(form);
    }
    @GetMapping("/avaliacao/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }

}
