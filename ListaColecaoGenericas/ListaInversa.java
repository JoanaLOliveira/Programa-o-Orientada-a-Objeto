/* Escreva um programa que cria um objeto LinkedList de 10 caracteres e, então, cria um
segundo objeto LinkedList contendo uma cópia da primeira lista, mas na ordem inversa.
Não devem ser utilizados métodos da Java API para realizar a inversão.
 */

package ListaColecaoGenericas;

import java.util.LinkedList;
import java.util.Scanner;

public class ListaInversa {
    // Método para ler 10 caracteres e armazenar na lista original
    public static LinkedList<Character> criarListaOriginal() {
        LinkedList<Character> lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 caracteres (um por vez):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            String entrada = scanner.nextLine();
            while (entrada.length() != 1) {
                System.out.print("Entrada inválida. Digite apenas 1 caractere: ");
                entrada = scanner.nextLine();
            }
            lista.add(entrada.charAt(0));
        }

        return lista;
    }

    // Método para criar uma nova lista invertida, sem usar métodos da API
    public static LinkedList<Character> inverterLista(LinkedList<Character> original) {
        LinkedList<Character> invertida = new LinkedList<>();

        // Percorrendo de trás para frente usando índice manual
        for (int i = original.size() - 1; i >= 0; i--) {
            invertida.add(original.get(i));
        }

        return invertida;
    }

    // Método principal
    public static void main(String[] args) {
        LinkedList<Character> listaOriginal = criarListaOriginal();
        LinkedList<Character> listaInvertida = inverterLista(listaOriginal);

        System.out.println("\nLista original: " + listaOriginal);
        System.out.println("Lista invertida: " + listaInvertida);
    }
}
