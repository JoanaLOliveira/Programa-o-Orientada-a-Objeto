package CodigosAula.Classes.Conta;

public class DemoConta {
    public static void main(String[] args) {
        ContaBancaria contaPedro = new ContaBancaria("Pedro",1200.56,true);

        ContaBancaria contaJoao = new ContaBancaria("Joao");

        contaPedro.imprimeDados();
        contaJoao.imprimeDados();
    }
}
