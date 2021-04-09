package com.example.naverreservation.Response;

import com.example.naverreservation.Domain.ReservationInfoPrice;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
public class ReservationResponse {
    //
    private int id;
    private String reservationName;
    private String Email;
    private String reservationTelephone;
    private String reservationDate;
    private List<ReservationInfoPrice> prices = new ArrayList<>();
    private boolean cancelYn;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

    private int productId;
    private int displayInfoId;
}
