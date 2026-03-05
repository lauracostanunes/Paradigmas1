public class Placar {
    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int pontos){
        if(time.equals("Casa")){ // if(time.equalsIgnoreCase("casa")){ para escrever casa ou Casa
            this.pontosCasa += pontos;
        }
        else if(time.equals("Visitante")){
            this.pontosVisitante += pontos;
        }
    }

    public void proximoQuarto(){
        if(periodoQuarto < 4){
            periodoQuarto++;
        }
        else {
            System.out.println("Jogo finalizado!");
        }
    }

    public String toString(){
        return this.nomeTimeCasa + " " + this.pontosCasa +
                " x " + this.pontosVisitante + " " + this.nomeTimeVisitante +
                "\nPeríodo: " + this.periodoQuarto + "° quarto";
    }

}