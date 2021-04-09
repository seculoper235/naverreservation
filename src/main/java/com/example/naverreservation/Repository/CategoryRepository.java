package com.example.naverreservation.Repository;

import com.example.naverreservation.Domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
