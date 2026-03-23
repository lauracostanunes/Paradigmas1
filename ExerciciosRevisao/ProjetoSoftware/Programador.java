package ProjetoSoftware;
// Exercício 4: Projeto de Software - Apenas Agregação (Independência entre as partes)
//Classes: Programador (id, nome, linguagemPrincipal) e Projeto (id, nomeProjeto).
//O Projeto agrega vários programadores.
//Regra: Crie um método para listar todos os programadores que estão trabalhando no projeto.

public class Programador {
    private int id;
    private String nome, linguagemPrincipal;

    public Programador() {
    }

    public Programador(int id, String nome, String linguagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
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

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", linguagemPrincipal='" + linguagemPrincipal + '\'' +
                '}';
    }
}