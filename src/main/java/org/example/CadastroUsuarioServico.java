package org.example;

import java.util.Scanner;

public class CadastroUsuarioServico implements UsuarioAuthenticacao {

    private void cadastrarUsuario(Usuario usuario) {
        Scanner scanner = new Scanner(System.in); //cria a classe que permite obter letras do console
        System.out.println("QUAL SEU NOME ?"); // exibe texto no console
        String nome = scanner.nextLine(); // permite obter o texto digitado no console

        System.out.println("QUAL SEU CPF ?"); // exibe texto no console
        String cpf = scanner.nextLine(); // permite obter o texto digitado no console

        System.out.println("QUAL SEU EMAIL ?"); // exibe texto no console
        String email = scanner.nextLine(); // permite obter o texto digitado no console

        System.out.println("QUAL SUA SENHA ?"); // exibe texto no console
        String senha = scanner.nextLine(); // permite obter o texto digitado no console

        usuario.setSenha(senha);
        usuario.setCpf(cpf);
        usuario.setEmail(email);
        usuario.setNome(nome);
        System.out.println("usuario cadastro: " + usuario);
    }

    @Override
    public void autenticaUsuario(Usuario usuario) {
        cadastrarUsuario(usuario);
    }
}
