package com.example.naverreservation.Response;

import com.example.naverreservation.Domain.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
public class ProductResponse {
    private int totalCount;
    private List<Product> items = new ArrayList<>();
}
