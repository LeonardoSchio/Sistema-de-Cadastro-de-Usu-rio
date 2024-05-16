package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Autenticacao
        //TODO: cadastra usuario. // OK
        //TODO: permitir login de usuario.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo! Escolha uma opção:");
        System.out.println("1 - Cadastrar Usuário");
        System.out.println("2 - Fazer Login");
        System.out.println("3 - Fazer LogOut");
        System.out.println("4 - Sair");

        Usuario usuario = new Usuario();
        while (true) {
            System.out.print("Opção: ");
            String escolha = scanner.nextLine();
            UsuarioAuthenticacao cadastroUsuarioServico = new CadastroUsuarioServico();
            UsuarioAuthenticacao loginUsuarioServico = new LoginUsuarioServico();
            UsuarioAuthenticacao logOutUsuarioServico = new LogOutUsuarioServico();
            switch (escolha) {
                case "1":
                    System.out.println("Você escolheu cadastrar usuário.");
                    cadastroUsuarioServico.autenticaUsuario(usuario);
                    break;
                case "2":
                    System.out.println("Você escolheu fazer login.");
                    loginUsuarioServico.autenticaUsuario(usuario);
                    break;
                case "3":
                    System.out.println("Você escolheu fazer logOut.");
                    logOutUsuarioServico.autenticaUsuario(usuario);
                    break;
                case "4":
                    System.out.println("Saindo do programa...");
                    scanner.close(); // Fechando o scanner antes de sair
                    System.exit(0); // Finalizando o programa
                    break;
                default:
                    System.out.println("Opção inválida! Escolha uma opção válida.");
            }
        }
    }
}