package com.example.europcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.europcar.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
