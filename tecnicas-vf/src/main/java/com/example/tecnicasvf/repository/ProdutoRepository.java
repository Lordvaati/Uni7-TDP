package com.example.tecnicasvf.repository;

import com.example.tecnicasvf.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProdutoRepository extends JpaRepository<Produto, Integer> {

    Produto findByCodigbar(Integer codigbar);
    List<Produto> findAllByCategoria(String categoria);
    List<Produto> findAllByQuantidade(Integer Quantidade);
}
