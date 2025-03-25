package org.example.services;

import org.example.entities.Produto;
import org.example.repositories.ProdutoReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    public ProdutoReposytory reposytory;

    public List<Produto> findAll(){
        return reposytory.findAll();
    }

    public Optional<Produto> findById(Long id){
        return reposytory.findById(id);
    }
    public Produto insert(Produto produto){
        return reposytory.save(produto);
    }
    public void delete(Long id){
        reposytory.deleteById(id);
    }

    public boolean update(Long id, Produto produto){
        Optional<Produto>optional=reposytory.findById(id);
        if (optional.isPresent()){
            Produto produto1 = optional.get();
            produto1.setDescricao(produto.getDescricao());
            produto1.setEstoque(produto.getEstoque());
            produto1.setPrecoCusto(produto.getPrecoCusto());
            produto1.setPrecoVenda(produto.getPrecoVenda());
            reposytory.save(produto1);
            return true;
        }
        return false;
    }
}
