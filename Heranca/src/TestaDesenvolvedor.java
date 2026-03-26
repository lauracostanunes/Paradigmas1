import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestaDesenvolvedor {
    // Polimorfismo
    public static void exibir (Desenvolvedor camaleao) {
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bônus" + camaleao.calcularBonus());
    }

    public static void main(String[] args) {
        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");
        exibir(jr1);

        Pleno p1 = new Pleno("Beltrano", "Java", 6000, 5);
        exibir(p1);

        Senior s1 = new Senior("Ciclano", "Java", 8000, 2000);
        exibir(s1);


        ArrayList<Desenvolvedor> empresa = new ArrayList<>();
        empresa.add(jr1);
        empresa.add(p1);
        empresa.add(s1);
    }
}