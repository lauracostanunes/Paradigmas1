package EdificiosApartamentos;

public class TestaEdificio {
    public static void main(String[] args){
        Edificio ed1 = new Edificio(1, "Rua Cuba");

        ed1.construirApartamento(1,1);
        ed1.construirApartamento(2,1);
        ed1.construirApartamento(1,2);
        ed1.construirApartamento(3,5);

        ed1.listarApartamentos();

        ed1 = null;

        ed1.listarApartamentos();
        // Não existe mais Edificio consequentemente não há mais Apartamentos
    }
}