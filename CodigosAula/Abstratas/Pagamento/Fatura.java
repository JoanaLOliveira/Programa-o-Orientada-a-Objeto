package CodigosAula.Abstratas.Pagamento;

public class Fatura implements Pagavel{
    private double precoUnidade;
    private int quantidade;

    public Fatura(double precoUnidade, int quantidade) {
        this.precoUnidade = precoUnidade;
        this.quantidade = quantidade;
    }

    public double getValorPagamento() {
        return quantidade*precoUnidade;
    }
}
