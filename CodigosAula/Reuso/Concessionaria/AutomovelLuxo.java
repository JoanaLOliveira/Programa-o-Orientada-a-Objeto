package CodigosAula.Reuso.Concessionaria;

public class AutomovelLuxo extends AutomovelBasico{
    private boolean arCondicionado;
    private boolean direcaoHidraulica;

    public AutomovelLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado, boolean direcaoHidraulica) {
        super(ano, modelo, cor, airbag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public double quantoCusta() {
        double custo = super.quantoCusta();
        if (arCondicionado) custo += 4000;
        if (direcaoHidraulica) custo += 5000;
        return custo;
    }

    @Override
    public String toString() {
        String rep = "ano: " + ano;
        rep += "modelo: " + modelo;
        rep += "cor: " + cor;
        rep += "airbag: " + airbag;
        rep += "radio: " + radio;
        rep += "arCondicionado: " + arCondicionado;
        rep += "direcaoHidraulica: " + direcaoHidraulica;
        return rep;
    }
}
