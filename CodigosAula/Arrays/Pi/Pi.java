package CodigosAula.Arrays.Pi;

import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhas, colunas;

        System.out.print("Linhas: ");
        linhas = sc.nextInt();
        int[][] triangulo = new int[linhas][];

        for (int linha = 0; linha < linhas; linha++) {
            colunas = linha + 2;
            triangulo[linha] = new int[colunas];
            triangulo[linha][0] = 1;
            triangulo[linha][colunas - 1] = 1;
            for (int c = 1; c < triangulo[linha].length-1; c++) {
                triangulo[linha][c] = triangulo[linha-1][c] + triangulo[linha-1][c-1];
            }
        }

        for (int lin = 0; lin < triangulo.length; lin++) {
            for (int col = 0; col < triangulo[lin].length; col++) {
                System.out.print(triangulo[lin][col] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
