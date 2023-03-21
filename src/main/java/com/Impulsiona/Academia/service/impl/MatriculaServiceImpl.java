package com.Impulsiona.Academia.service.impl;

import com.Impulsiona.Academia.model.Aluno;
import com.Impulsiona.Academia.model.Matricula;
import com.Impulsiona.Academia.model.form.MatriculaForm;
import com.Impulsiona.Academia.repository.AlunoRepository;
import com.Impulsiona.Academia.repository.MatriculaRepository;
import com.Impulsiona.Academia.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        matricula.setAluno(aluno);
        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll () {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
