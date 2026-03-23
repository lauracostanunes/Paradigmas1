package ClinicaMedica;
// Parte 1: Classe de Associação (Relacionamentos com Atributos)
//Exercício 1: Sistema de Clínica Médica
//Crie um sistema para gerenciar consultas.
//Classes: Medico (id, nome, especialidade) e Paciente (id, nome, cpf).
//Classe de Associação: Consulta. Ela deve conter a Data (use LocalDateTime),
// o ValorDaConsulta e as referências para o Médico e o Paciente.
//Desafio: No main, crie um médico e um paciente, e registre uma consulta para o dia 20/05/2026.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Classe de Associação
public class Consulta {
    private LocalDateTime data;
    private float valorConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDateTime data, Paciente paciente, Medico medico, float valorConsulta) {
        this.data = data;
        this.paciente = paciente;
        this.medico = medico;
        this.valorConsulta = valorConsulta;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(float valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'mm'ss");
        return "Consulta{" +
                "data=" + data.format(formatoBR) +
                ", valorConsulta=" + valorConsulta +
                ", \n\tmedico=" + medico +
                ", \n\tpaciente=" + paciente +
                '}';
    }
}