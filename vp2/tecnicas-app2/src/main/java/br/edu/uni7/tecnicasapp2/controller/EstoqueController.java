package br.edu.uni7.tecnicasapp2.controller;

import br.edu.uni7.tecnicasapp2.model.Estoque;
import br.edu.uni7.tecnicasapp2.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class EstoqueController {

    private final EstoqueRepository estoqueRepository;

    @Autowired
    public EstoqueController(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    @ResponseBody
    @RequestMapping(value = "formEstoque{id}", method = RequestMethod.GET)
    public Estoque encontrarMateria(@PathVariable Integer id) {
        return estoqueRepository.findById(id);
    }

    @ResponseBody
    @RequestMapping(value = "formEstoque", method = RequestMethod.GET)
    public List<Estoque> listarMaterias() {
        return estoqueRepository.read();
    }


    @ResponseBody
    @RequestMapping(value = "materia/{id}", method = RequestMethod.DELETE)
    public void apagarMateria(@PathVariable Integer id) {
        estoqueRepository.delete(id);
    }

    @ResponseBody
    @RequestMapping(value = "materia/{id}", method = RequestMethod.PUT)
    public void atualizarProduto(@PathVariable Integer id, @RequestBody Estoque produto) {
        estoqueRepository.update(id, produto);
    }

}

