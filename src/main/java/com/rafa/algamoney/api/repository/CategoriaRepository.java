package com.rafa.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafa.algamoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
