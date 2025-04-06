/* Faça um programa para somar dois números:
• O programa deve conter um método int obterIntValido() para receber um número
inteiro válido
– Enquanto o valor não for um número inteiro, deve-se solicitar um novo número e
exibir uma mensagem de erro.
• O método principal deve utilizar obterIntValido() para obter os dois operandos e apresentar a soma deles
• É obrigatório o uso de tratamento de exceção para realizar esta questão. Respostas
que não utilizarem essa técnica serão completamente desconsideradas.
 */

package ListaExcecoes;

import java.util.Scanner;

public class SomaComValidacao {
     public static int obterIntValido(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                return scanner.nextInt(); // Tenta ler um inteiro
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = obterIntValido(scanner);
        int numero2 = obterIntValido(scanner);

        int soma = numero1 + numero2;

        System.out.println("A soma dos dois números é: " + soma);

        scanner.close();
    }
}
