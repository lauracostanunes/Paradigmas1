package SmartHome;

public class TestaSmartHome {
    public static void main(String[] args) {
        // Testando FechaduraEletronica
        System.out.println("=== Teste Fechadura Eletrônica ===");
        FechaduraEletronica fechadura = new FechaduraEletronica("1234");

        fechadura.validarAcesso("0000");  // Senha errada
        fechadura.ligar();                // Não deveria funcionar sem validação? (aqui apenas simula)
        fechadura.validarAcesso("1234");  // Senha correta
        fechadura.ligar();                // Destranca
        System.out.println("Estado: " + (fechadura.isDestrancada() ? "Destrancada" : "Trancada"));
        fechadura.desligar();             // Tranca novamente

        System.out.println();

        System.out.println("Teste Termostato Inteligente");
        TermostatoSmart termostato = new TermostatoSmart(23.5);

        System.out.println("Temperatura atual: " + termostato.lerTemperatura() + "°C");
        termostato.ligar();
        termostato.setTemperaturaAtual(24.0);
        System.out.println("Nova temperatura: " + termostato.lerTemperatura() + "°C");
        termostato.desligar();
        System.out.println("Termostato ligado? " + termostato.isLigado());
    }
}