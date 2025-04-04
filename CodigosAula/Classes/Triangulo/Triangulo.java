package CodigosAula.Classes.Triangulo;

public class Triangulo {
    private float lado1;
    private float lado2;
    private float lado3;
    private String desc;

    public void inicializa(float l1, float l2, float l3, String d) {
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
        desc = d;
    }

    public float perimetro() {
        return lado1 + lado2 + lado3;
    }
}
