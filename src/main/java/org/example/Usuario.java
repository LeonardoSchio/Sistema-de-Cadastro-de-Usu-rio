package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Usuario {

    private String email;
    private String nome;
    private String cpf;
    private String senha;
    private String dataDeCriacao;
    private boolean logado;
    public Usuario() {
        this.dataDeCriacao = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Usuario(String email, String nome, String cpf, String senha) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
