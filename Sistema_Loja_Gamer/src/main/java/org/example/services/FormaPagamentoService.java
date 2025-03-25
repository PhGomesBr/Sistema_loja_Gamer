package org.example.services;

import org.example.entities.FormaPagamento;
import org.example.repositories.FormaPagamentoReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.List;
import java.util.Optional;

@Service
public class FormaPagamentoService {
    @Autowired
    public FormaPagamentoReposytory reposytory;

    public List<FormaPagamento>findAll(){
        return reposytory.findAll();
    }

    public Optional<FormaPagamento>findById(Long id){
        return reposytory.findById(id);
    }
    public FormaPagamento insert(FormaPagamento formaPagamento){
        return reposytory.save(formaPagamento);
    }
    public void delete(Long id){
        reposytory.deleteById(id);
    }

    public boolean update(Long id, FormaPagamento formaPagamento){
        Optional<FormaPagamento>optional=reposytory.findById(id);
        if (optional.isPresent()){
            FormaPagamento formaPagamento1 = optional.get();
            formaPagamento1.setTipo(formaPagamento.getTipo());
            formaPagamento1.setDescricao(formaPagamento.getDescricao());
            formaPagamento1.setStatus(formaPagamento.getStatus());
            reposytory.save(formaPagamento1);
            return true;
        }
        return false;
    }
}
