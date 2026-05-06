package dc.unifacef.memoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controlador de requisição REST
@RequestMapping("/produto") // Mapeamento de requisição
public class ProdutoController {
    @GetMapping
    public String mensagem() {
        return "Boa noite a todos";
    }

}
