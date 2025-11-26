package br.com.proa.cadastro_produtos.controller;

import br.com.proa.cadastro_produtos.model.Produto;
import br.com.proa.cadastro_produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Responsável por fazer a conexão com o mundo exterior (com quem vai utilizar a API)
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    //metodo de inserir e salvar
    public void salvaProduto(@RequestBody Produto produto){
        repository.save(produto);
    }

    @GetMapping
    public List <Produto> pegaProdutos(){
        return repository.findAll();
    }
}
