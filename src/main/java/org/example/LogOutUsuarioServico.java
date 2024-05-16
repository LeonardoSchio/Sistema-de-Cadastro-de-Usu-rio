package org.example;

public class LogOutUsuarioServico implements UsuarioAuthenticacao {
    @Override
    public void autenticaUsuario(Usuario usuario) {
        if (usuario.isLogado()) {
            usuario.setLogado(false);
            System.out.println("Usuario desconectado");
        } else {
            System.out.println("Erro ao desconectar");
        }
    }
}
