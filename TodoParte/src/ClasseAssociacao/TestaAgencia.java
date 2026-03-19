package ClasseAssociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args) {
        Passageiro pas1 = new Passageiro("123", "Fulano");

        LocalDateTime data = LocalDateTime.of(2026, 4, 18, 8, 15);
        Voo v01 = new Voo(777, "Florianópolis", "Ribeirão Preto", data);

        Reserva r1 = new Reserva(912, LocalDateTime.now(), 10, pas1, v01);
        System.out.println(r1.toString());

        // Usando o objeto r1, exiba o nome do passageiro da reserva
        System.out.println(r1.getPassageiro().getNome());

        // Usando o objeto r1, exiba o destino do voo da reserva
        System.out.println(r1.getVoo().getDestino());
    }
}