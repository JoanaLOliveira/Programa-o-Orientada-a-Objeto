package CodigosAula.Classes.Evento;

public class EventoAcademico {
    private String nomeDoEvento;
    private String localDoEvento;
    private int numeroDeParticipantes;

    EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes) {
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public void mostraEvento() {
        System.out.println("nomeDoEvento : " + this.nomeDoEvento);
        System.out.println("localDoEvento : " + this.localDoEvento);
        System.out.println("numeroDeParticipantes : " + this.numeroDeParticipantes);
    }
}
