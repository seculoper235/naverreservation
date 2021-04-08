package com.example.naverreservation.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_price")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Product product;

    private String priceType;
    private int price;
    // decimal(5, 2)
    private int discount;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
}
