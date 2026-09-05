package br.edu.faex.academico.controller;

import br.edu.faex.academico.model.Aluno;
import br.edu.faex.academico.model.Professor;
import br.edu.faex.academico.service.AlunoService;
import br.edu.faex.academico.service.ProfessorService;

import java.util.List;

public class ProfessorController   {
    private ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    public void cadastrar(Professor professor){
        this.service.cadastrar(professor);
    }
    public List<Professor> listar(){
        return this.service.listar();
    }

    public Professor buscarPorId(long id){
        return service.buscarPorId(id);
    }
}
