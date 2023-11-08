package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpresaController {
    public void consultarFuncionarios () throws SQLException {

        //Representa a conexão
        Conexao conexao = new Conexao();

        // Responsavel por executar query
        Connection objConnection = conexao.getConnection();

        // Query
        Statement statement = objConnection.createStatement();

        //Armazena resposta do banco
        String queryConsulta = "SELECT * FROM funcionarios";
       ResultSet resultSet = statement.executeQuery(queryConsulta);

        while (resultSet.next()){
            int idFuncionario = resultSet.getInt("id_funcionario");
            String nome = resultSet.getString("nome");
            String cargo = resultSet.getString("cargo");
            Double salario = resultSet.getDouble("salario");
            String departamento = resultSet.getString("departamento");

            System.out.println(idFuncionario);
            System.out.println(nome);
            System.out.println(cargo);
            System.out.println(salario);
            System.out.println(departamento);
            System.out.println("_-_-_-_-_-_-_-_-_-");

       }
    }
}
