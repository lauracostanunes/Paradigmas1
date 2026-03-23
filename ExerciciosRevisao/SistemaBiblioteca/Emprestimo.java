package SistemaBiblioteca;
// Exercício 2: Sistema de Biblioteca - Classe de Associação (Relacionamentos com Atributos)
//Modele o empréstimo de livros.
//Classes: Leitor (id, nome) e Livro (id, titulo, autor).
//Classe de Associação: Emprestimo. Deve conter a dataEmprestimo,
// a dataDevolucaoPrevista e o vínculo entre o Leitor e o Livro.
//Regra: O método toString() do empréstimo deve mostrar os dados do
// leitor e o título do livro emprestado.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime dataEmprestimo, dataDevolucao;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(){}

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucao, Leitor leitor, Livro livro){
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDateTime getDataEmprestimo(){
        return this.dataEmprestimo;
    }

    public LocalDateTime getDataDevolucao(){
        return this.dataDevolucao;
    }

    public Leitor getLeitor (){
        return this.leitor;
    }

    public Livro getLivro(){
        return this.livro;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Empréstimo: " +
                "\n\t-Livro: " + this.getLivro().getTitulo() +
                "\n\t-Autor: " + this.getLivro().getAutor() +
                "\n\t-Leitor: " + this.getLeitor().getNome() +
                "\n\t-Data de Empréstimo: " + this.getDataEmprestimo().format(formatoBR) +
                "\n\t-Data de Devolução: " + this.getDataDevolucao().format(formatoBR)
                ;
    }
}