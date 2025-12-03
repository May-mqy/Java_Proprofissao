package br.com.proa.cadastro_produtos.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer idProduto; //Rapper class Integer = int representado em uma classe

    @Column(name= "nome_produto")
    private String nomeProduto;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "quant_estoque")
    private Integer quantEstoque;

    @Column(name = "preco")
    private BigDecimal preco;
    //BigDecimal classe para números exatos.

    @Column (name = "img_url")
    private String ImgUrl;


    //GETTERS E SETTERS
    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(Integer quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getImgUrl() {return ImgUrl;}

    public void setImgUrl(String imgUrl) { ImgUrl = imgUrl;}
}
