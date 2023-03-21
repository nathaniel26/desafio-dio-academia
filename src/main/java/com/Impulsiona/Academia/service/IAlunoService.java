package com.Impulsiona.Academia.service;

import com.Impulsiona.Academia.model.Aluno;
import com.Impulsiona.Academia.model.AvaliacaoFisica;
import com.Impulsiona.Academia.model.form.AlunoForm;
import com.Impulsiona.Academia.model.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    /**
     * Cria aluno a partir do formulario
     */
    Aluno creat(AlunoForm form);
    /**
     * Retorna um Aluno que está no banco de dados de acordo com seu Id.
     *acordo com o Id fornecido.
     */
    Aluno get(Long id);
    /**
     * Retorna os Alunos que estão no banco de dados.
     * Uma lista os Alunos que estão salvas no DB.
     */
    List<Aluno> getAll();
    /**
     * Atualiza o Aluno.
     * @param id id do Aluno que será atualizado.
     * @param formUpdate formulário referente aos dados necessários para atualização do Aluno
     * no banco de dados.
     * @return Aluno recém-atualizado.
     */
    Aluno update(Long id, AlunoUpdateForm formUpdate);

    /**
     * Deleta um Aluno específico.
     * @param id id do Aluno que será removido.
     */
    void delet(Long id);

    /**
     *
     * @param id id do aluno que será recuperada a lista de avaliações
     * @return uma lista com todas as avaliações do aluno de acordo com o Id
     */
    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);




}
