package dc.unifacef.memoria.service;

import dc.unifacef.memoria.model.Produto;

@Service

public class ProdutoService {
    // Cria ArrayList
    List<Produto> produtos = new ArrayList<Produto>();
    // Consulta os produtos na lista
    public List<Produto> consulta() {
return this.produtos;
    }
    // Insere produto na lista
    public Produto cria(Produto produto) {
    produto.setId(id);
    return produto;
    }
}