package CodigosAula.Reuso.Concessionaria;

public class DemoConcessionario {
    public static void main(String[] args) {
        AutomovelLuxo auto = new AutomovelLuxo(2023, "ferrari", "vermelho", true, true, true, true);
        System.out.println(auto);
        System.out.println(auto.quantoCusta());
    }
}
