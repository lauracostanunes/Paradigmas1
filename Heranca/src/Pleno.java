public class Pleno extends Desenvolvedor{
    private int projetosEntrgues; // Quantidade

    public Pleno() {
        super();
    }

    public Pleno (String nome, String linguagem, float salarioBase, int projetosEntrgues) {
        super(nome, linguagem, salarioBase);
        this.projetosEntrgues = projetosEntrgues;
    }
}
