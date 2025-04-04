package CodigosAula.Intro;

import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        String nome;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Bem vindo(a) " + nome);

        entrada.close();
    }
}
