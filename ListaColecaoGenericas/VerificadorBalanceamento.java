/* Utilizando uma pilha, escreva um programa que verifique se uma String de entrada formada apenas por ’(’ e ’)’ está balanceada.
 */

package ListaColecaoGenericas;

import java.util.Scanner;
import java.util.Stack;

public class VerificadorBalanceamento {
    public static boolean estaBalanceada(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false; // Tentou fechar sem abrir
                }
                pilha.pop(); // Fecha um parêntese aberto
            } else {
                // Ignora qualquer outro caractere (opcional)
            }
        }

        return pilha.isEmpty(); // Se sobrou algo na pilha, está desequilibrada
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma expressão com parênteses: ");
        String entrada = scanner.nextLine();

        if (estaBalanceada(entrada)) {
            System.out.println("A expressão está balanceada.");
        } else {
            System.out.println("A expressão NÃO está balanceada.");
        }

        scanner.close();
    }
}
