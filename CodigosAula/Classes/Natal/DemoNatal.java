package CodigosAula.Classes.Natal;

public class DemoNatal {
    public static void main(String[] args) {
        // Data d2022 = new Data();
        // d2022.inicializaData(25, 12, 2022);
        // Data d2021 = new Data();
        // d2021.inicializaData(25, 12, 2021);
        // Data d2020 = new Data();
        // d2020.inicializaData(25, 12, 2020);
        Data n2022 = Data.natal(2022);
        Data n2021 = Data.natal(2021);
        Data n2020 = Data.natal(2020);
        n2022.mostraData();
        n2021.mostraData();
        n2020.mostraData();
    }
}
