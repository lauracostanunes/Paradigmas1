package CineTeatro;

// Exercício 8: Sistema de Cine-Teatro
//Objetivo: Criar um sistema que gerencie uma Sessao, relacionando-a com um Filme (Agregação) e com os Ingressos vendidos (Composição).1. Classe Filme (Objeto Independente)
//Um filme existe no catálogo do cinema, independentemente de estar em cartaz ou não.
//Atributos: id, titulo, genero, duracao (int - em minutos).
//Requisito: Construtor completo, Getters/Setters e toString().
//2. Classe Ingresso (Objeto Parte)
//Um ingresso só faz sentido dentro de uma sessão específica. Se a sessão for cancelada, o ingresso perde o valor e deixa de existir no sistema.
//Atributos: id, assento (String), tipo (String: "Inteira" ou "Meia"), preco (float).
//Requisito: Construtor completo e toString().
//3. Classe Sessao (O "Todo" Principal)
//A Sessao é o coração do sistema, onde as relações acontecem.
//Atributos: id, horario (use LocalDateTime), sala (int).
//Relacionamentos:
//Agregação: Um atributo do tipo Filme. (Use o método vincularFilme(Filme f) que recebe o objeto pronto).
//Composição: Um ArrayList<Ingresso>. (Use o método venderIngresso(int id, String assento, String tipo, float preco) que cria o objeto Ingresso internamente).
//4. Classe de Teste TestaCinema
//No método main, realize o fluxo:Instancie 2 objetos Filme (ex: "Batman", "Duna")
// Instancie uma Sessao para a Sala 01, informando uma data e hora futura (ex: 20/07/2026 às 20h00)
// Agregação: Vincule o filme "Batman" a esta sessão.Composição: Simule a venda de 3 ingressos (A1, A2 e A3) usando o método de composição da classe Sessao.Imprima os dados da Sessão.

public class Filme {
    private int id;
    private String titulo;
    private String genero;
    private int duracao;

    public Filme(int id, String titulo, String genero, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}