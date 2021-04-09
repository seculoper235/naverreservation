package com.example.naverreservation.Response;

import com.example.naverreservation.Domain.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
public class DisplayInfoResponse {
    private Double averageScore;
    private List<Comment> comments = new ArrayList<>();
    private DisplayInfo displayInfo;
    private DisplayInfoImage displayInfoImage;
    private List<ProductImage> productImages = new ArrayList<>();
    private List<ProductPrice> productPrices = new ArrayList<>();
}
