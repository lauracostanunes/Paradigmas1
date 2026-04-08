package SistemadeVeiculos;

public class Aviao extends Veiculo {
    private float altitudeMax;

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    @Override
    public void mover(){
        System.out.printf("Avião voando a [%.3f] km/h e [%.3f] metros\n", this.velocidade, this.altitudeMax);
    }
    @Override
    public void abastecer(){
        System.out.println("Abastecendo com querosene de aviação");
    }

    @Override
    public String toString() {
        return "\n Aviao{" +
                super.toString() +
                "altitudeMax=" + altitudeMax +
                '}';
    }
}