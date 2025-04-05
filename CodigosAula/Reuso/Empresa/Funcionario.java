package CodigosAula.Reuso.Empresa;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String id, double salario) {
        super(nome, id);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    // @Override
    // public String toString() {
    //     return super.toString() + ", salario=" + salario;
    // }
}
