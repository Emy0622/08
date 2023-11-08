package br.senai.sp.jandira.model;

public class Conexao {


    String banco, servidor, senha, usuario;

    public Conexao() {
        this.servidor = "localhost";
        this.banco = "db_empresa";
        this.usuario = "root";
        this.senha = "bcd127";
    }

    public boolean connectDriv() {
        try{

    } catch(Exception erro) {
        System.out.println(erro);
        return false;
    }
}