package CodigosAula.Intro;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        int dia, mes, ano;
        Scanner ent = new Scanner(System.in);

        System.out.print("Dia: ");
        dia = ent.nextInt();
        System.out.print("Mes: ");
        mes = ent.nextInt();
        System.out.print("Ano: ");
        ano = ent.nextInt();

        System.out.print(dia + " de ");
        if (mes == 1) {
            System.out.print("Janeiro");
        } else if (mes == 2) {
            System.out.print("Fevereiro");
        } else if (mes == 3) {
            System.out.print("Marco");
        } else if (mes == 4) {
            System.out.print("Abril");
        } else if (mes == 5) {
            System.out.print("Maio");
        } else if (mes == 6) {
            System.out.print("Junho");
        } else if (mes == 7) {
            System.out.print("Julho");
        } else if (mes == 8) {
            System.out.print("Agosto");
        } else if (mes == 9) {
            System.out.print("Setembro");
        } else if (mes == 10) {
            System.out.print("Outubro");
        } else if (mes == 11) {
            System.out.print("Novembro");
        } else {
            System.out.print("Dezembro");
        }
        System.out.println(" de " + ano);

        switch(mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 dias");
                break;
            case 2:
                System.out.println("28 dias");
                break;
            default:
                System.out.println("30 dias");
        }

        ent.close();
    }
}
