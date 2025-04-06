/* Escreva um programa que utilize a estrutura de dados do tipo Mapa para contar o número
de ocorrências de cada letra em uma String. Por exemplo, a string "HELLO THERE"
contém dois H’s, três E’s, dois L’s, um O , um T e um R. Exiba os resultados em ordem
alfabética.
• Serão totalmente desconsideradas respostas que não utilizarem um Mapa como
parte da estratégia de solução desta questão. */

package ListaColecaoGenericas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContadorDeLetras {
    public static Map<Character, Integer> contarLetras(String texto) {
        Map<Character, Integer> contagem = new HashMap<>();

        texto = texto.toUpperCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                contagem.put(c, contagem.getOrDefault(c, 0) + 1);
            }
        }

        return contagem;
    }

    public static void exibirOrdenado(Map<Character, Integer> contagem) {
        // TreeMap ordena automaticamente por chave (a-z)
        Map<Character, Integer> ordenado = new TreeMap<>(contagem);

        System.out.println("\nOcorrências de letras:");
        for (Map.Entry<Character, Integer> entrada : ordenado.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        Map<Character, Integer> resultado = contarLetras(frase);
        exibirOrdenado(resultado);

        scanner.close();
    }
}
