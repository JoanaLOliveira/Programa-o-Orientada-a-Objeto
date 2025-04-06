/* Escreva um programa que simule cada minuto de um dia de atendimento de um consultório de um médico com as seguintes especificações:
• O consultório mantém apenas dados número de RG e idade de seus pacientes;
(i) Crie uma classe para representar um paciente.
• Pacientes maiores de 60 anos são colocados na fila prioritária e os demais na fila
comum;
• Pacientes da fila prioritária são sempre atendidos primeiro;
• O primeiro paciente chega ao consultório no momento de sua abertura e a cada 4
minutos um novo paciente chega ao consultório;
(i) Pesquise como gerar números aleatórios e utilize essa técnica para determinar
o RG e a idade de cada paciente.
• Uma consulta demora 5 minutos e o próximo paciente da fila é chamado;
• O consultório atende 20 pacientes por dia. */

package ListaColecaoGenericas.Atendimento;

public class Paciente {
    private int rg;
    private int idade;

    public Paciente(int rg, int idade) {
        this.rg = rg;
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Paciente{" + "RG=" + rg + ", Idade=" + idade + '}';
    }
}
