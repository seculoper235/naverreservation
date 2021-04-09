package com.example.naverreservation.Response;

import com.example.naverreservation.Domain.Promotion;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
public class PromotionResponse {
    private List<Promotion> items = new ArrayList<>();
}
