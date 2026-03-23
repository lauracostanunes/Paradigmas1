package TimeBasquete;

public class TestaBasquete {
    public static void main(String[] args){
        Atleta a1 = new Atleta(1, "Afonso", "Pivô");

        Time time = new Time(1, "SesiFranca", "Lucas");
        System.out.println(time.toString());

        time.contratarAtleta(a1);
        System.out.println(time.toString());

        // Time anulado
        time = null;
        System.out.println(time);

        // Atleta independente
        System.out.println("Sem equipe:" + a1.toString());
    }
}