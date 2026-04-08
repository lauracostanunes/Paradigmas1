package SistemadeVeiculos;

public class Teste {
    public static void print(Veiculo veiculo){
        veiculo.mover();
        veiculo.abastecer();
        System.out.println(veiculo.toString());
    }
    public static void main(String[] args){

        Aviao av1 = new Aviao("Avião1", "Modelo1", 0, 2000);
        print(av1);

        CarroEletrico cr1 = new CarroEletrico("byd", "dolphin", 70, 24);
        print(cr1);

        Veiculo veiculo = av1;
        veiculo.mover();

        veiculo = cr1;
        veiculo.mover();
    }
}