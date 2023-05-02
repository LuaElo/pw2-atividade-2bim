public class UsuarioTeste {
    public static void main(String[] args) {
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome("horacio.augusto");
        novoUsuario.setCodigo(1);

        novoUsuario.logDados();
        novoUsuario.autenticar(novoUsuario.getSenha());


    }


}

