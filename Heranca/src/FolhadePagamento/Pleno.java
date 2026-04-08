package FolhadePagamento;

public class Pleno extends Desenvolvedor{
    private int projetosEntregues;

    public Pleno(String nome, String linguagem, float salarioBase, int projetosEntregues){
        super(nome, linguagem, salarioBase);
        this.projetosEntregues = projetosEntregues;
    }
    public void setProjetosEntregues(int projetosEntregues){
        this.projetosEntregues = projetosEntregues;
    }
    public int getProjetosEntregues(){
        return this.projetosEntregues;
    }
    @Override
    public void codar(){
        System.out.println("Pleno desenvolvendo código-fonte e fazendo Code Review");
    }
    @Override
    public float calcularBonus(){
        return super.calcularBonus() + this.salarioBase * 0.15F;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projetosEntregues=" + projetosEntregues +
                '}';
    }
}