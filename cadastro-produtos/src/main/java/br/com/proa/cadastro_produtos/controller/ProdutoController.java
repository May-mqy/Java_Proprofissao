package br.com.proa.cadastro_produtos.controller;

import br.com.proa.cadastro_produtos.model.Produto;
import br.com.proa.cadastro_produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

//Responsável por fazer a conexão com o mundo exterior (com quem vai utilizar a API)
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;


    @PostMapping
    //metodo de inserir e salvar
    //public void salvaProduto(@RequestBody Produto produto){
    //    repository.save(produto); }

    //Um dos modos de salvar o usuario e passar para o Front-End
    public ResponseEntity<Produto> salvaProduto(@RequestBody Produto produto){
        produto = repository.save(produto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}") //adicionar o id do produto ao final do Endpoint/Rota
                .buildAndExpand(produto.getIdProduto())
                .toUri();

        return ResponseEntity.created(uri).body(produto);
        //Mostra qual Status utilizar: Created(201) e Ok(200)
    }

    @GetMapping
    public ResponseEntity <List <Produto>> pegaProdutos(){
        List<Produto> produtos = repository.findAll();

        return ResponseEntity.ok().body(produtos);
    }

    //Médoto de Deletar por Id
    @DeleteMapping
    public ResponseEntity<Void> deletaProdutoPeloId(@PathVariable Integer idProduto){
        repository.deleteById(idProduto);
        return ResponseEntity.noContent().build();
        //NoContent --> não vai conter nada no campo
    }
}
