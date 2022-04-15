package com.example.europcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.europcar.entity.Area;

public interface AreaRepository extends JpaRepository<Area, Integer> {
}
