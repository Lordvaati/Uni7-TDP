package com.example.tecnicasvf.controller;

import com.example.tecnicasvf.model.Produto;
import com.example.tecnicasvf.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProdutoController {
    private final ProdutoService produtoService;


    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @ResponseBody
    @RequestMapping(value = "produto", method = RequestMethod.POST)
    public Produto create(@RequestBody Produto produto){
        return produtoService.create(produto);
    }


    @ResponseBody
    @RequestMapping(value = "produto", method = RequestMethod.GET)
    public List<Produto> list(){
        return produtoService.list();
    }

    @ResponseBody
    @RequestMapping(value = "produto/{id}", method = RequestMethod.GET)
    public Produto FindById(@PathVariable Integer id){
        return produtoService.findById(id);
    }

    @ResponseBody
    @RequestMapping(value = "produtos/categoria/{categoria}", method = RequestMethod.GET)
    public List<Produto> findByCategoria(@PathVariable String categoria){
        return produtoService.findAllByCategoria(categoria);
    }

    @ResponseBody
    @RequestMapping(value = "produtos/semestoque", method = RequestMethod.GET)
    public List<Produto> findAllByQuantidadeIs(){
        return produtoService.findAllByQuantidade(0);
    }

    @ResponseBody
    @RequestMapping(value = "produtos/codigbar/{codigbar}", method = RequestMethod.GET)
    public Produto findBycodbarras(@PathVariable Integer codigbar){
        return produtoService.getProdutoByCodigbar(codigbar);
    }

    @ResponseBody
    @RequestMapping(value = "produto/{id}", method = RequestMethod.PUT)
    public Produto update(@PathVariable Integer id, @RequestBody Produto produtos) {
        produtos.setId(id);
        return produtoService.update(produtos);

    }

    @ResponseBody
    @RequestMapping("produto/{id}")
    public void remove(@PathVariable Integer id) {
        produtoService.remove(id);
    }


}

