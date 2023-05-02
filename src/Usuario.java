import java.time.LocalDate;

public class Usuario {
    private int codigo;
    private String nome;
    private String senha;
    private int tentativasAcesso;
    private Boolean primeiroAcesso;
    LocalDate dataInativacao;
    private String status;
    private String inativarUsuario;
    private String logDados;


    public Usuario() {
        this.senha = "etec#123";
        this.primeiroAcesso = true;
        this.status = "ATIVO";

    }

    public Number getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
            this.primeiroAcesso = false;
            this.status = "ATIVO";
            this.tentativasAcesso = 0 ;


    }

    public Number getTentativasAcesso() {
        return tentativasAcesso;
    }

    public void setTentativasAcesso(int tentativasAcesso) {
        this.tentativasAcesso = tentativasAcesso;
    }

    public Boolean getPrimeiroAcesso() {
        return primeiroAcesso;
    }

    public void setPrimeiroAcesso(Boolean primeiroAcesso) {
        this.primeiroAcesso = primeiroAcesso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    void inativarUsuario(){
        LocalDate.now();
        if (primeiroAcesso == true)
        {
            this.primeiroAcesso = false;
            this.status = "INATIVO";
        }
    }

    void logDados(){
        System.out.println("Código: " + codigo);
        System.out.println("Usuário: " + nome);
        System.out.println("Senha: " + senha);
        System.out.println("Trocar senha: " + true);
        System.out.println("Status: ATIVO");

    }

}

