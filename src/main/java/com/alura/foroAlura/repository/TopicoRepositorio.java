package com.alura.foroAlura.repository;

import com.alura.foroAlura.model.Topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepositorio extends JpaRepository<Topicos, Integer> {
}
