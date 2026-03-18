import java.util.ArrayList;
import java.util.Date; // Para usar uma classe que já está pronta. Ex: Date

public class Pedido {
    private int id; // Letra minúscula = objeto
    private Date data; // Letra maiúscula = classe
    private Cliente cliente; // Associação todo-parte
    // Aqui tem uma classe dentro da outra
    // Não é uma herança. Uma classe contém a outra
    private ArrayList<ItemPedido> itensPedido; // Esse não faz parte de getter e setter
    // e não entra como parâmetro no construtor

    public Pedido() {
        // Aloca espaço na memória
    }

    // O cliente veio pronto, mostrando sua independência do pedido
    // Agregação
    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itensPedido = new ArrayList<>();
    }

    // Adiciona um item de pedido no vetor ou no pedido
    // public void adicionaItemPedido(ItemPedido itemPedido) {
    //this.itensPedido.add(ItemPedido); }
    // Seria assim se fosse uma agregação

    public void adicionaItemPedido (int id, float quantidade, Produto produto) { // Composição
        ItemPedido aux = new ItemPedido(id, quantidade, produto);
        this.itensPedido.add(aux);
        System.out.println("Item do pedido adicionado com sucesso!");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // O cliente veio pronto, mostrando sua independência do pedido
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=" + cliente + // Vai mostrar o toString do Cliente
                ", itens do pedido = " + itensPedido +
                '}';
    }
    public float calculaTotalPedido() {
        float soma = 0;
        for (ItemPedido ip : this.itensPedido) {
            soma += ip.getQuantidade() * ip.getProduto().getPreco();
        }
        return soma;
    }
}