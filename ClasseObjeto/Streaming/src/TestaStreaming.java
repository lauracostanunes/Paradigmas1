public class TestaStreaming {
    public static void main(String[] args){
        Streaming c1 = new Streaming("Laura", "Família");
        System.out.println(c1.toString());
        c1.assistirFilme("Star Wars: Episódio II - A Vingaça dos Sith");
        c1.cancelarAssinatura();
        System.out.println(c1.toString());
    }
}