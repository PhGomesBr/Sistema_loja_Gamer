package org.example.repositories;

import org.example.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoReposytory extends JpaRepository<Produto, Long> {
}
