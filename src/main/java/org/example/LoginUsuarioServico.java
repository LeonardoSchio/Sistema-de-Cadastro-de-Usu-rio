package org.example;

import java.util.Scanner;

public class LoginUsuarioServico implements UsuarioAuthenticacao {

    public void logaUsuario(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUAL SEU EMAIL ?"); // exibe texto no console
        String email = scanner.nextLine(); // permite obter o texto digitado no console

        System.out.println("QUAL SUA SENHA ?"); // exibe texto no console
        String senha = scanner.nextLine(); // permite obter o texto digitado no console
        if (!email.equals(usuario.getEmail()) || !senha.equals(usuario.getSenha())) {
            throw new IllegalArgumentException("EMAIL INVALIDO SEU BURRO, CADASTRE-SE PRIMEIRO");
        } else {
            System.out.println("Usuario logado com sucesso !");
            usuario.setLogado(true);
        }
    }

    @Override
    public void autenticaUsuario(Usuario usuario) {
        logaUsuario(usuario);
    }
}
