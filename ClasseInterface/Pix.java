public class Pix implements Pagamento {
    @Override
    public void autorizar(double valor) {
        System.out.println("Gerando QRCode");
        System.out.println("Pagamento no valor " + "foi enviado");
    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante disponível no app");
    }
}