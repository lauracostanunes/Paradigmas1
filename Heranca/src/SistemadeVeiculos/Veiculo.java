// Exercício 1: Especialização de Comportamento (Sistema de Veículos)
//Objetivo: Praticar a criação de uma nova hierarquia e a anulação de métodos com regras de negócio distintas.
//Enunciado:
//Modele um sistema de transporte seguindo as instruções abaixo:Classe Pai Veiculo:
//
//Atributos: marca (String), modelo (String), velocidade (float).
//Método mover(): Deve imprimir "Veículo se movendo...".
//Método abastecer(): Deve imprimir "Veículo reabastecendo...".
//Classe Filha Aviao:
//Atributo próprio: altitudeMax (float).
//Anule o método mover(): Deve imprimir "Avião voando a [velocidade] km/h e [altitude] metros".
//Anule o método abastecer(): Deve imprimir "Abastecendo com querosene de aviação".
//Classe Filha CarroEletrico:
//Atributo próprio: autonomiaBateria (int).
//Anule o método mover(): Deve imprimir "Carro elétrico movendo-se silenciosamente".
//Anule o método abastecer(): Deve imprimir "Recarregando bateria em posto de carga rápida".
//Classe de Teste:
//Crie instâncias das classes.
//Crie uma variável do tipo Veiculo e faça-a apontar para um Aviao. Chame o método mover().
//Mude a mesma variável para apontar para um CarroEletrico. Chame o método mover() novamente.

package SistemadeVeiculos;

public class Veiculo{
    protected String marca, modelo;
    protected float velocidade;

    public Veiculo(){}

    public Veiculo(String marca, String modelo, float velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void mover(){
        System.out.println("Veículo se movendo...");
    }

    public void abastecer(){
        System.out.println("Veículo reabastecendo...");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
