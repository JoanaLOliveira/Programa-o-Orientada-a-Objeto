public class DemoAcademico {
    public static void main(String[] args) {
        RegistroAcademico alunoGrad = new RegistroAcademico("Ricardo", "2023113907", "BTI");
        RegistroAcademicoPosGraduacao alunoPos = new RegistroAcademicoPosGraduacao("Luana", "2022178798", "Ecologia", "Estudo do semi-arido", "Lucas");
        RegistroAcademicoPosGraduacao alunoPos2 = new RegistroAcademicoPosGraduacao(alunoGrad, "IA aplicada agricultura", "Joana");
        System.out.println(alunoGrad);
        System.out.println(alunoPos);
        System.out.println(alunoPos2);
    }
}