package SistemaBiblioteca;

import java.time.LocalDateTime;

public class TestaBiblioteca {
    public static void main(String[] args){
        Livro livro = new Livro(15, "Shatter-Me", "Tahereh Mafi");
        Leitor leitor = new Leitor(17, "Afonso");
        LocalDateTime dataDevolucao = LocalDateTime.of(2026,3,21,15,17);

        Emprestimo emp1 = new Emprestimo(LocalDateTime.now(), dataDevolucao, leitor, livro);

        System.out.println(emp1.toString());
    }
}