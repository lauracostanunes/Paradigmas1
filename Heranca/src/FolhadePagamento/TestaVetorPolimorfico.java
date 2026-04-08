package FolhadePagamento;

import java.util.ArrayList;

public class TestaVetorPolimorfico {
    public static void exibir(Desenvolvedor desenvolvedor){
        desenvolvedor.codar();
        System.out.println(desenvolvedor.calcularBonus());
        System.out.println(desenvolvedor.toString());
    }
    public static void main(String[] args){
        ArrayList<Desenvolvedor> devs = new ArrayList<Desenvolvedor>();

        devs.add(new Junior("miguel", "JAVA", 1200, "daniel"));
        devs.add(new Pleno("jonata", "js", 2300, 2));
        devs.add(new Senior("marina", "Java", 5000, 3000));

        devs.forEach(TestaVetorPolimorfico::exibir);

    }
}