public class Programador extends Funcionario{

    private String cargo;
    private String senha;

    public Programador(String nome, String sexo, double salario, String cargo, String senha) {
        super(nome, sexo, salario);
        this.cargo = cargo;
        this.senha = senha;
    }

    public String getSenha() {
        return "*******";
    }

    @Override
    public String toString() {
        return "Programador{" +
                "cargo='" + cargo + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
