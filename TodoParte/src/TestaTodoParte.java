import java.util.Arrays;
import java.util.Date;

public class TestaTodoParte {
    public static void main (String args[]) {
        // Cria um objeto da classe Cliente independente
        // Cria objeto-parte
        Cliente cl1 = new Cliente();// Chamou o construtor vazio
        Cliente cl2 = new Cliente(1, "Fulano", "1234", "Rua Chile");

        Produto pr1 = new Produto(100, "Mouse", "Mouse óptico", 100);
        Produto pr2 = new Produto(200, "Monitor", "Wildscreen", 900);
        Produto pr3 = new Produto(300, "Pen Drive", "Azul e prata", 35);

        // Cria o objeto-todo
        Pedido p1 = new Pedido(10, new Date(), cl2); // Colocou a data de agora new Date
        // Data de execução do programa
        p1.adicionaItemPedido(1000, 5, pr1);
        p1.adicionaItemPedido(201, 2, pr2);
        p1.adicionaItemPedido(503, 7, pr3);
        System.out.println(p1.toString());
        System.out.println(p1.calculaTotalPedido());
    }
}
// No digrama:
// + para públicos
// - para privados