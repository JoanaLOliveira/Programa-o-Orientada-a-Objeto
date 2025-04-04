package CodigosAula.Intro;

import java.util.Scanner;

public class FatorialRecusivo {
    public static void main(String[] args) {
        int n;
        Scanner ent = new Scanner(System.in);

        System.out.print("Valor: ");
        n = ent.nextInt();

        System.out.println(n + "! = " + fatorial(n));

        ent.close();  

    }

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num*fatorial(num-1);
        }
    }
}
