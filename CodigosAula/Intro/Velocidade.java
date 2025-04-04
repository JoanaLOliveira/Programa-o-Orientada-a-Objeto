package CodigosAula.Intro;

import java.text.DecimalFormat;

public class Velocidade {
    public static void main(String[] args) {
        double kmph = 0.0, mps, mph, fps;

        System.out.println("km/h\tm/s\tmi/h\tpes/s");
        while (kmph <= 50.0) {
            mps = 0.2778*kmph;
            mph = 0.6214*kmph;
            fps = 0.9113*kmph;
            System.out.println(new DecimalFormat("00.00").format(kmph) + "\t" + new DecimalFormat("00.00").format(mps) + "\t" + new DecimalFormat("00.00").format(mph) + "\t" + new DecimalFormat("00.00").format(fps));
            kmph+=0.5;
        }
    }
}
