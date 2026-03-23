package TimeBasquete;
// Parte 2: Apenas Agregação (Independência entre as partes)
//Exercício 3: Time de Basquete (Inspirado no Franca Basquete)
//Classes: Atleta (id, nome, posicao) e Time (id, nome, tecnico).
//O Time possui um ArrayList<Atleta>.
//Regra: Implemente o método void contratarAtleta(Atleta a).
// No main, prove que se o objeto Time for anulado, o objeto Atleta continua existindo.

public class Atleta {
    private int id;
    private String nome, posicao;

    public Atleta() {
    }

    public Atleta(int id, String nome, String posicao){
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "\n\tAtleta{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                '}';
    }
}