public class Junior extends Desenvolvedor {
    private String mentor;

    public Junior() {
        super(); // Chama o construtor vazio da superclasse
    }
    public Junior(String nome, String linguagem, float salarioBase, String mentor) {
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

}
