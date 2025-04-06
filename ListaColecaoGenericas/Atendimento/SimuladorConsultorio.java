/*  Escreva um programa que simule cada minuto de um dia de atendimento de um consultório de um médico com as seguintes especificações:
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

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class SimuladorConsultorio {
    public static void main(String[] args) {
        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Queue<Paciente> filaComum = new LinkedList<>();

        Random random = new Random();
        int tempo = 0;
        int pacientesAtendidos = 0;
        int proximaChegada = 0;

        System.out.println("Iniciando simulação de atendimento...");

        while (pacientesAtendidos < 20) {

            // Chegada de novo paciente
            if (tempo == proximaChegada) {
                int rg = 10000000 + random.nextInt(90000000);
                int idade = 10 + random.nextInt(90);

                Paciente novoPaciente = new Paciente(rg, idade);
                if (idade >= 60) {
                    filaPrioritaria.add(novoPaciente);
                    System.out.println("Novo paciente PRIORITÁRIO chegou às " + tempo + "min: " + novoPaciente);
                } else {
                    filaComum.add(novoPaciente);
                    System.out.println("Novo paciente comum chegou às " + tempo + "min: " + novoPaciente);
                }

                proximaChegada += 4;
            }

            // Atendimento a cada 5 minutos
            if (tempo % 5 == 0 && pacientesAtendidos < 20) {
                Paciente atendido = null;

                if (!filaPrioritaria.isEmpty()) {
                    atendido = filaPrioritaria.poll();
                } else if (!filaComum.isEmpty()) {
                    atendido = filaComum.poll();
                }

                if (atendido != null) {
                    pacientesAtendidos++;
                    System.out.println("[" + tempo + "min] Atendendo paciente: " + atendido);
                }
            }

            tempo++;
        }

        System.out.println("\nAtendimento finalizado. Total de pacientes atendidos: " + pacientesAtendidos);
    }
}
