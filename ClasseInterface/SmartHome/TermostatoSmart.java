package SmartHome;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private double temperaturaAtual;
    private boolean ligado;

    public TermostatoSmart(double temperaturaInicial) {
        this.temperaturaAtual = temperaturaInicial;
        this.ligado = false;
    }

    @Override
    public void ligar() {
        if (ligado) {
            System.out.println("Termostato já está ligado.");
        } else {
            ligado = true;
            System.out.println("Termostato ligado.");
        }
    }

    @Override
    public void desligar() {
        if (!ligado) {
            System.out.println("Termostato já está desligado.");
        } else {
            ligado = false;
            System.out.println("Termostato desligado.");
        }
    }

    @Override
    public double lerTemperatura() {
        return temperaturaAtual;
    }

    // Método auxiliar para simular mudança de temperatura
    public void setTemperaturaAtual(double temperatura) {
        this.temperaturaAtual = temperatura;
    }

    public boolean isLigado() {
        return ligado;
    }
}