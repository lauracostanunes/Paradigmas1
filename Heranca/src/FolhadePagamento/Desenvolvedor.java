package FolhadePagamento;

public class Desenvolvedor {
    protected String nome, linguagem;
    protected float salarioBase;


    public Desenvolvedor(String nome, String linguagem, float salarioBase){
        this.nome = nome;
        this.linguagem = linguagem;
        this.salarioBase = salarioBase;
    }
    public Desenvolvedor(){

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }
    public String getLinguagem(){
        return this.linguagem;
    }
    public void codar(){
        System.out.println("Desenvolvedor planeja e escreve código-fonte.");
    }
    public float calcularBonus(){
        return this.salarioBase * 0.05F;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}