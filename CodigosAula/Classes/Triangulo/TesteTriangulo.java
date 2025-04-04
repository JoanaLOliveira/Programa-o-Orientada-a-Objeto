package CodigosAula.Classes.Triangulo;

public class TesteTriangulo {
    public static void main(String[] args) {
        Triangulo t1, t2, t3;
        t1 = new Triangulo();
        t1.inicializa(3.0F, 4.0F, 5.0F, "Escaleno");
        t2 = new Triangulo();
        t2.inicializa(3.0F, 4.0F, 5.0F, "Escaleno");
        t3 = t1;
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
    }
}
