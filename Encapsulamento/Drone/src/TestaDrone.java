public class TestaDrone {
    public static void main(String[] args){

        Drone d1 = new Drone();
        d1.setCodigo("BB8");
        d1.setBateria(50);
        d1.decolar();
        d1.subir(10);
        d1.descer(3);
        System.out.println(d1.toString());

        Drone d2 = new Drone("R2-D2", 0, 10, false);
        d2.decolar();
        System.out.println(d2.toString());

        Drone d3 = new Drone("C3PO", 0, 80, false);
        d3.decolar();
        d3.subir(30);
        System.out.println(d3.toString());
    }
}