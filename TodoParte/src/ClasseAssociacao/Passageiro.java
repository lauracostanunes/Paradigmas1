package ClasseAssociacao;
// Relacionamento N:N
// Relacionada -> agregação
// Ainda está em todo-parte


// Objeto-parte

public class Passageiro {
    private String cpf, nome;

    public Passageiro() {
    }

    public Passageiro(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        // Não tem setter porque não tem validação
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}