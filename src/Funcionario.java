public class Funcionario {
    private String nome;
    private String sexo;
    private double salario;

    public Funcionario(String nome, String sexo, double salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
