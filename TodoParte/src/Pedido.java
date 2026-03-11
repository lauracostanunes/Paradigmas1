import java.util.Date; // Para usar uma classe que já está pronta. Ex: Date

public class Pedido {
   private int id; // Letra minúscula = objeto
   private Date data; // Letra maiúscula = classe
   private Cliente cliente; // Associação todo-parte
    // Aqui tem uma classe dentro da outra
    // Não é uma herança. Uma classe contém a outra

    public Pedido() {

    }
    // O cliente veio pronto, mostrando sua independência do pedido
    // Agregação
    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
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
                ", cliente=" + cliente + // Vai mostrar o toString do Cliente (id, data e cliente)
                '}';
    }
}