package com.example.naverreservation.Response;

import com.example.naverreservation.Domain.ReservationInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
public class ReservationInfoResponse {
    private int size;
    private List<ReservationInfo> reservations = new ArrayList<>();
}
