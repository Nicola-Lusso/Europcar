package com.example.europcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.europcar.entity.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Integer> {
}
