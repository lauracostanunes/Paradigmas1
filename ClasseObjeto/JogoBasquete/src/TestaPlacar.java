public class TestaPlacar {
    public static void main(String[] args){

        Placar jogo1 = new Placar("Lakers", "Bulls");

        // 1º quarto
        jogo1.registrarPonto("Casa", 3);
        jogo1.registrarPonto("Visitante", 1);
        System.out.println(jogo1);
        jogo1.proximoQuarto();

        // 2º quarto
        jogo1.registrarPonto("Casa", 2);
        System.out.println(jogo1);
        jogo1.proximoQuarto();

        // 3º quarto
        jogo1.registrarPonto("Visitante", 3);
        System.out.println(jogo1);
        jogo1.proximoQuarto();

        // 4º quarto
        jogo1.registrarPonto("Casa", 2);
        System.out.println(jogo1);

        // Final do jogo
        jogo1.proximoQuarto();
    }
}