package br.edu.faex.academico.config;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static String URL = "jdbc:mysql://localhost:3306/sistema_academico";
    private static String USUARIO = "root";
    private static String SENHA = "";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(
                URL,
                USUARIO,
                SENHA
        );
    }
}



