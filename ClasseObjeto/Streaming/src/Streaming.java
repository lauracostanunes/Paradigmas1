public class Streaming{
    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean status;
    public String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;
        this.status = true;
        this.ultimoFilmeAssistido = "";

        if(plano.equals("Básico")){
            this.mensalidade = 25.9F;
        }
        else if(plano.equals("Premium")){
            this.mensalidade = 45.9F;
        }
        else if(plano.equals("Família")){
            this.mensalidade = 60.9F;
        }
    }

    public String getStatus(){
        if (this.status){
            return "Ativo";
        }
        else{
            return "Suspenso";
        }
    }

    public void assistirFilme(String nomeFilme){
        if (this.status){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("O usuário está assistindo: " + nomeFilme);
        }
        else{
            System.out.println("Conta inativa. Pague a fatura para reativar");
        }
    }

    public void cancelarAssinatura(){
        this.status = false;
    }

    public String toString(){
        return "\nUsuario: " + this.usuario +
                "\nPlano: " + this.plano +
                "\nMensalidade: R$" + this.mensalidade +
                "\nÚltimo filme assistido: " + this.ultimoFilmeAssistido +
                "\nStatus: " + this.getStatus();
    }
}