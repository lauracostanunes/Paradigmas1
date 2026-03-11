import java.util.Arrays;
import java.util.Date;

public class TestaTodoParte {
    public static void main (String args[]) {
        // Cria um objeto da classe Cliente independente
        // Cria objeto-parte
        Cliente cl1 = new Cliente();// Chamou o construtor vazio
        Cliente cl2 = new Cliente(1, "Fulano", "1234", "Rua Chile");

        // Cria o objeto-todo
        Pedido p1 = new Pedido(10, new Date(), cl2); // Colocou a data de agora new Date
        // data de execução do programa
        System.out.println(p1.toString());
    }

}
