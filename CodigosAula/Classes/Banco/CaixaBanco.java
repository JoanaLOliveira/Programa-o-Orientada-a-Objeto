package CodigosAula.Classes.Banco;

public class CaixaBanco {
    private static int clientesAtendidos = 0;
    private int numeroCaixa;

    public CaixaBanco(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }
    
    public void iniciaAtendimento() {
        clientesAtendidos++;
        System.out.println("Atendendo cliente " + clientesAtendidos + " no caixa " + numeroCaixa);
    }

    public static void imprimeClientes() {
        System.out.println("Clientes atendidos: " + clientesAtendidos);
    }
}
