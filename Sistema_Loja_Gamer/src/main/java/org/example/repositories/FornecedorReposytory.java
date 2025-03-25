package org.example.repositories;

import org.example.entities.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorReposytory extends JpaRepository<Fornecedor, Long> {
}
