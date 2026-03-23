package ClinicaMedica;

import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args){
        Paciente p1 = new Paciente("Afonso", 5, "987654321");
        Medico med1 = new Medico(1, "Geral", "Tiago");
        LocalDateTime data = LocalDateTime.of(2026,5,20,7,15);
        float valor = 10;

        Consulta consulta = new Consulta(data, p1, med1, valor);

        System.out.println(consulta.toString());
    }
}