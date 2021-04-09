package com.example.naverreservation.Repository;

import com.example.naverreservation.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
