package SmartHome;

public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    private final String senhaCorreta;
    private boolean destrancada; // true = destrancada (ligada), false = trancada (desligada)

    public FechaduraEletronica(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
        this.destrancada = false; // inicia trancada
    }

    @Override
    public void validarAcesso(String senha) {
        if (senhaCorreta.equals(senha)) {
            System.out.println("Acesso validado. Fechadura pode ser operada.");
        } else {
            System.out.println("Senha incorreta! Acesso negado.");
        }
    }

    @Override
    public void ligar() {
        if (destrancada) {
            System.out.println("Fechadura já está destrancada.");
        } else {
            destrancada = true;
            System.out.println("Fechadura destrancada (ligada).");
        }
    }

    @Override
    public void desligar() {
        if (!destrancada) {
            System.out.println("Fechadura já está trancada.");
        } else {
            destrancada = false;
            System.out.println("Fechadura trancada (desligada).");
        }
    }

    public boolean isDestrancada() {
        return destrancada;
    }
}