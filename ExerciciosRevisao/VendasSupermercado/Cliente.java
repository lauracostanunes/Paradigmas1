// Parte 4: Agregação e Composição Combinadas
//Exercício 7: Sistema de Vendas de Supermercado
//Este exercício combina tudo o que vimos até agora:Agregação: Crie a classe Produto (id, nome, preco). O Produto existe no estoque da loja independente de qualquer venda.Agregação: Crie a classe Cliente (id, nome).Composição: Crie a classe ItemVenda (id, quantidade). O item de venda só existe dentro de uma Venda.A Classe "Todo": Crie a classe Venda.
//Ela agrega um Cliente.
//Ela é composta por um ArrayList<ItemVenda>.
//Cada ItemVenda dentro da lista, por sua vez, agrega um Produto.

package VendasSupermercado;

public class Cliente {
    private int id;
    private String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}