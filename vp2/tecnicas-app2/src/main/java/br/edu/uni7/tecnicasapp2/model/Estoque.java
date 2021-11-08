package br.edu.uni7.tecnicasapp2.model;

public class Estoque {

    private Integer id;
    private String nome;
    private String fabricante;
    private Integer quantidade;
    private Integer preco;

    public Estoque(Integer id, String nome, String fabricante, Integer quantidade, Integer preco) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }


}
