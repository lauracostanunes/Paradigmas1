public class TestaArCondicionado {
    public static void main(String[] args){

        ArCondicionado a1 = new ArCondicionado();
        a1.setMarca("LG");
        a1.setModelo("Dual");
        a1.setTemperatura(15);
        a1.setTemperatura(22);
        a1.setLigado(true);
        System.out.println(a1.toString());
        a1.ativarModoTurbo();

        ArCondicionado a2 = new ArCondicionado("Samsung", "WindFree", 25, true);
        System.out.println(a2.toString());
        a2.ativarModoTurbo();

        ArCondicionado a3 = new ArCondicionado("Gree", "Eco", 20, false);
        System.out.println(a3.toString());
        a3.ativarModoTurbo();
    }
}