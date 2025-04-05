package CodigosAula.Reuso.Empresa;

public class Pessoa {
    private String nome;
    private String id;

    public Pessoa(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    // @Override
    // public String toString() {
    //     return "nome=" + nome + ", id=" + id;
    // }    
}
