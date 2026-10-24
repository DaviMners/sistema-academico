package br.edu.faex.academico;

import br.edu.faex.academico.config.Conexao;
import br.edu.faex.academico.controller.AlunoController;
import br.edu.faex.academico.model.Aluno;
import br.edu.faex.academico.repository.AlunoRepository;
import br.edu.faex.academico.service.AlunoService;

import java.sql.Connection;

public class Main {
    static void main() {


        try (Connection con = Conexao.conectar()){
            System.out.println("Conectado");

        } catch (Exception e){
            System.out.println("Erro ao conectar");
            System.out.println(e.getMessage());
        }

    }
}
