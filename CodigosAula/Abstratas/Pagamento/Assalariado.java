package CodigosAula.Abstratas.Pagamento;

public class Assalariado extends  Empregado{
    private double salario;

    public Assalariado(String nome, String ctps, double salario) {
        super(nome, ctps);
        this.salario = salario;
    }
    
    public double getValorPagamento() {
        return salario;
    }    
}
