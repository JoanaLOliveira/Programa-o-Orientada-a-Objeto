package CodigosAula.Reuso.Empresa;

public class ChefeDepartamento extends Funcionario{
    private String departamento;

    public ChefeDepartamento(String nome, String id, double salario, String departamento) {
        super(nome, id, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    // @Override
    // public String toString() {
    //     // return super.toString() + ", departamento=" + departamento;
    //     return "nome=" + getNome() + ", departamento=" + departamento;
    // }    
}
