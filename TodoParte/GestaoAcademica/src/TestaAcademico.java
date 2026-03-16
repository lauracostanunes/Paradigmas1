public class TestaAcademico {

    public static void main(String[] args) {

        // Objetos independentes
        Aluno a1 = new Aluno(1, "Afonso", "2023001", "Ciência da Computação");
        Aluno a2 = new Aluno(2, "Bernardo", "2023002", "Sistema de Informação");

        // Objeto todo
        Disciplina d1 = new Disciplina(10, "Programação Orientada a Objetos", "Daniel Pires");

        // Agregação
        d1.matricularAluno(a1);
        d1.matricularAluno(a2);

        // Composição
        d1.criarAvaliacao(100, "Prova Semestral");

        // Pegando a avaliação criada
        Avaliacao av = d1.getAvaliacoes().get(0);

        // Composição aninhada
        av.adicionarQuestao(1, "Explique o conceito de Classe.", 2);
        av.adicionarQuestao(2, "Explique Herança.", 3);
        av.adicionarQuestao(3, "Explique Polimorfismo.", 5);

        // Impressão final
        System.out.println(d1.toString());
    }
}