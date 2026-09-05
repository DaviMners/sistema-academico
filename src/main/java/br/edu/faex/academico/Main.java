package br.edu.faex.academico;

import br.edu.faex.academico.controller.AlunoController;
import br.edu.faex.academico.controller.ProfessorController;
import br.edu.faex.academico.model.Aluno;
import br.edu.faex.academico.model.Professor;
import br.edu.faex.academico.repository.AlunoRepository;
import br.edu.faex.academico.repository.ProfessorRepository;
import br.edu.faex.academico.service.AlunoService;
import br.edu.faex.academico.service.ProfessorService;

public class Main {
    static void main() {
        Aluno aluno1 = new Aluno("Aleandro Ribeiro de Lima", "aleandro.lima@faex.edu.br");
        Aluno aluno2 = new Aluno("Maria Helena de Lima", "maria.lima@faex.edu.br");
        Professor professor1 = new Professor("Aleandro Ribeiro de Lima", "aleandro.lima@faex.edu.br");
        Professor professor2 = new Professor("Maria Helena de Lima", "maria.lima@faex.edu.br");

        AlunoRepository alunoRepository = new AlunoRepository();
        AlunoService alunoService = new AlunoService(alunoRepository);
        AlunoController alunoController = new AlunoController(alunoService);

        ProfessorRepository professorRepository = new ProfessorRepository();
        ProfessorService professorService = new ProfessorService(professorRepository);
        ProfessorController professorController = new ProfessorController(professorService);

        alunoController.cadastrar(aluno1);
        alunoController.cadastrar(aluno2);
        professorController.cadastrar(professor1);
        professorController.cadastrar(professor2);

        for (Professor professor : professorController.listar()){
            System.out.println("Nome: " + professor.getNome());
            System.out.println("E-mail: " + professor.getEmail());
            System.out.println("-------------------------------");
        }
        Professor professor = professorController.buscarPorId(1l);
        if (professor != null){
            System.out.println("Aluno Encontrado");
            System.out.println("Nome: " + professor.getNome());
            System.out.println("E-mail: " + professor.getEmail());
            System.out.println("-------------------------");
        }else {
            System.out.println("Aluno não encontrado");

        }

        for (Aluno aluno : alunoController.listar()) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("E-mail: " + aluno.getEmail());
            System.out.println("Ativo: " + aluno.isAtivo());
            System.out.println("-------------------------");
        }
        Aluno aluno = alunoController.buscarPorId(1l);
        if (aluno != null){
            System.out.println("Aluno Encontrado");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("E-mail: " + aluno.getEmail());
            System.out.println("Ativo: " + aluno.isAtivo());
            System.out.println("-------------------------");
        }else{
            System.out.println("Aluno não encontrado");
        }

    }
}
