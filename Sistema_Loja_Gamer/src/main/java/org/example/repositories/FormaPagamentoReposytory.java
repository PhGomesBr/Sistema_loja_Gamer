package org.example.repositories;

import org.example.entities.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormaPagamentoReposytory extends JpaRepository<FormaPagamento, Long> {
}
