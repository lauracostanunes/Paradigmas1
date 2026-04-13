public class Checkout {
    public static void main(String[] args) {
        Pagamento camaleao;

        camaleao = new CartaoCredito();
        camaleao.autorizar(700); // Polimorfismo
        camaleao.exibirComprovante(); // Polimorfismo

        camaleao = new Pix();
        camaleao.autorizar(300); // Polimorfismo
        camaleao.exibirComprovante(); // Polimorfismo
    }
}