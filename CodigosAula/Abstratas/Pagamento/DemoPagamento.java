package CodigosAula.Abstratas.Pagamento;

public class DemoPagamento {
    public static void main(String[] args) {
        Fatura f = new Fatura(5.89, 5);
        Assalariado a = new Assalariado("Lucas", "98639909", 9783.76);
        
        imprimeValorPagamento(a);
        imprimeValorPagamento(f);
    }

    public static void imprimeValorPagamento(Pagavel pag) {
        System.out.println(pag.getValorPagamento());
    }
}
