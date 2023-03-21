package com.Impulsiona.Academia.service.impl;

import com.Impulsiona.Academia.model.Aluno;
import com.Impulsiona.Academia.model.AvaliacaoFisica;
import com.Impulsiona.Academia.model.form.AlunoForm;
import com.Impulsiona.Academia.model.form.AlunoUpdateForm;
import com.Impulsiona.Academia.repository.AlunoRepository;
import com.Impulsiona.Academia.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {
    @Autowired
    private AlunoRepository repository;
    @Override
    public Aluno creat(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataDeNascimento());
        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delet(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
       Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();
    }
}
