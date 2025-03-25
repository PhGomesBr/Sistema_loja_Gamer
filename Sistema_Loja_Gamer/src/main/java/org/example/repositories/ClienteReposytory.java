package org.example.repositories;

import org.example.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteReposytory extends JpaRepository<Cliente, Long> {
}
