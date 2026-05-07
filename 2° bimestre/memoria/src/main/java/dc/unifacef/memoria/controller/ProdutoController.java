package dc.unifacef.memoria.controller;

import dc.unifacef.memoria.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Controlador de requisição REST
@RequestMapping("/produto") // Mapeamento de requisição
public class ProdutoController {
    // Injeção de dependência
    // Chamar métodos de um objeto sem instanciá-lo
    @Autowired
    ProdutoService service;

    // ResponseEntity é um tipo de dado de retorno do controler para FE
    @GetMapping
    public ResponseEntity<List<Produto>> consulta() {
        return ResponseEntity.ok(service.consulta());
    }

    @PostMapping
    public void cria(@RequestBody Produto produto) {
        Produto novo = service.cria(produto);
        // URL Uniform resourcew Identifier
        URI url = URI.create("/produto/" + novo.getId());
        return
    }
}
