public class Pleno extends Desenvolvedor{
    private int projetosEntrgues; // Quantidade

    public Pleno() {
        super();
    }

    public Pleno (String nome, String linguagem, float salarioBase, int projetosEntrgues) {
        super(nome, linguagem, salarioBase);
        this.projetosEntrgues = projetosEntrgues;
    }

    public int getProjetosEntrgues() {
        return projetosEntrgues;
    }

    public void setProjetosEntrgues(int projetosEntrgues) {
        this.projetosEntrgues = projetosEntrgues;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projetosEntrgues=" + projetosEntrgues +
                '}';
    }

    @Override
    public void codar() {
        System.out.println("Pleno desenvolvendo código e fazendo Code Review");
    }

    @Override
    public float calcularBonus() {
        return super.calcularBonus() + this.salarioBase * 0.15f;
    }
}