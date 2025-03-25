package org.example.services;

import org.example.entities.Fornecedor;
import org.example.repositories.FornecedorReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {
    @Autowired
    public FornecedorReposytory reposytory;

    public List<Fornecedor>findAll(){
        return reposytory.findAll();
    }

    public Optional<Fornecedor>findById(Long id){
        return reposytory.findById(id);
    }
    public Fornecedor insert(Fornecedor fornecedor){
        return reposytory.save(fornecedor);
    }
    public void delete(Long id){
        reposytory.deleteById(id);
    }

    public boolean update(Long id, Fornecedor fornecedor){
        Optional<Fornecedor>optional=reposytory.findById(id);
        if (optional.isPresent()){
            Fornecedor fornecedor1 = optional.get();
            fornecedor1.setCnpj(fornecedor.getCnpj());
            fornecedor1.setNomeFantasia(fornecedor.getNomeFantasia());
            fornecedor1.setRazaoSocial(fornecedor.getRazaoSocial());
            fornecedor1.setStatus(fornecedor.getStatus());
            reposytory.save(fornecedor1);
            return true;
        }
        return false;
    }
}
