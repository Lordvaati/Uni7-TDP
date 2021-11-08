package br.edu.uni7.tecnicasapp2.repository;

import br.edu.uni7.tecnicasapp2.model.Estoque;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class EstoqueRepository {

    private final List<Estoque> produtos;
    public EstoqueRepository() {
        produtos = new ArrayList<>();
    }
    public void create(Estoque produto) {
        produtos.add(produto);
    }

    public List<Estoque> read() {
        return produtos;
    }

    public void update(Integer id, Estoque novaMateria) {
        for (int i = 0; i < produtos.size(); i++) {
            if (Objects.equals(produtos.get(i).getId(), id)) {
                produtos.remove(i);
                produtos.add(i, novaMateria);
                break;
            }
        }
    }

    public void delete(Integer id) {
        Estoque toDelete = null;
        for (Estoque produto : produtos) {
            if (Objects.equals(id, produto.getId())) {
                toDelete = produto;
                break;
            }
        }

        if (toDelete != null) {
            produtos.remove(toDelete);
        }
    }

    public Estoque findById(Integer id) {
        for (Estoque produto : produtos) {
            if (Objects.equals(id, produto.getId())) {
                return produto;
            }
        }

        return null;
    }
}
