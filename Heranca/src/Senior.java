public class Senior extends Desenvolvedor {
    private float verbaLider; // Verba por ser líder

    public Senior() {
        super();
    }
    public Senior(String nome, String linguagem, float salarioBase, float verbaLider) {
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }
}