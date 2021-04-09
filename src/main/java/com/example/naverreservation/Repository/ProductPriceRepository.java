package com.example.naverreservation.Repository;

import com.example.naverreservation.Domain.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Integer> {
}
