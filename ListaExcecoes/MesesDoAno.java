/* Escreva um programa que:
• armazene em um vetor os nomes dos meses do ano
• solicite ao usuário que digite um valor inteiro
• mostre o nome do mês correspondente ao número digitado
• trate as exceções geradas pela digitação de valores inválidos para o índice do mês*/

package ListaExcecoes;

import java.util.Scanner;

public class MesesDoAno {
    private final String[] meses= {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };
    public String getMes(int numero) throws IndexOutOfBoundsException {
        // Subtrai 1 pois o índice começa em 0 (Janeiro = índice 0)
        return meses[numero - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MesesDoAno meses = new MesesDoAno();

        try {
            System.out.print("Digite um número de 1 a 12 para ver o mês correspondente: ");
            int numero = scanner.nextInt();

            String mes = meses.getMes(numero);
            System.out.println("O mês correspondente é: " + mes);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: O número deve estar entre 1 e 12.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }

}
