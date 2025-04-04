package CodigosAula.Intro;

import java.util.Scanner;

public class Media {

     public static void main(String[] args) {
        double v1, v2, v3, m;
        Scanner ent = new Scanner(System.in);

        System.out.print("Valor 1: ");
        v1 = ent.nextDouble();
        System.out.print("Valor 2: ");
        v2 = ent.nextDouble();
        System.out.print("Valor 3: ");
        v3 = ent.nextDouble();

        m = media(v1, v2, v3);

        System.out.println("Media: " + m);

        ent.close();       
    }

    public static double media(double n1, double n2, double n3) {
        double med = (n1 + n2 + n3)/3;
        return med;
    }
}