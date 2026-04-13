// Exercício: Sistema de Casa Inteligente (Smart Home)
//
//Objetivo: Trabalhar com múltiplas interfaces e a obrigatoriedade de implementar diferentes contratos de comportamento em uma mesma classe.
//1. As Interfaces (Os Contratos)
//
//Interface Autenticavel:
//Método: void validarAcesso(String senha);
//Interface DispositivoLigavel:
//Método: void ligar();
//Método: void desligar();
//Interface SensorTemperatura:
//Método: double lerTemperatura();
//2. As Classes (As Implementações)
//Classe FechaduraEletronica:
//Deve implementar: Autenticavel e DispositivoLigavel.
//Lógica: Ao validar a acesso com a senha correta, ela permite "ligar" (destrancar).
//Classe TermostatoSmart:
//Deve implementar: DispositivoLigavel e SensorTemperatura.
//Lógica: Ele pode ser ligado/desligado e retorna a temperatura atual do ambiente.
package SmartHome;

public interface Autenticavel {
    void validarAcesso(String senha);
}
