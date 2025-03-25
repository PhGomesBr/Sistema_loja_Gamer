package org.example.services;

import org.example.entities.Cliente;
import org.example.repositories.ClienteReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    public ClienteReposytory reposytory;

    public List<Cliente>findAll(){
        return reposytory.findAll();
    }
    public Optional<Cliente>findById(Long id){
        return reposytory.findById(id);
    }
    public Cliente insert(Cliente cliente){
        return reposytory.save(cliente);
    }
    public void delete(Long id){
        reposytory.deleteById(id);
    }
    public boolean update(Long id, Cliente cliente){
        Optional<Cliente> optional=reposytory.findById(id);
        if (optional.isPresent()){
            Cliente cliente1 = optional.get();
            cliente1.setCpf(cliente.getCpf());
            cliente1.setStatus(cliente.getStatus());
            cliente1.setNome(cliente.getNome());
            cliente1.setDataNacimento(cliente.getDataNacimento());
            reposytory.save(cliente1);
            return true;
        }
        return false;
    }

}
