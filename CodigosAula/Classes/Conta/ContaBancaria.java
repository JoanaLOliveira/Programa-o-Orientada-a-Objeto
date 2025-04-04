package CodigosAula.Classes.Conta;

public class ContaBancaria {
    private String nome;
    private double saldo;
    private boolean ehEspecial;    

    public ContaBancaria(String nome, double saldo, boolean ehEspecial) {
        this.nome = nome;
        this.saldo = saldo;
        this.ehEspecial = ehEspecial;
    }    

    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0.0;
        this.ehEspecial = false;
    }

    void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
        System.out.println("Conta especial: " + (ehEspecial? "sim":"nao"));
    }
}
