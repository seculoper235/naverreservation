package com.example.naverreservation.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "reservation_info_price")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationInfoPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private ReservationInfo reservationInfo;

    @ManyToOne
    private ProductPrice productPrice;

    private int count;
}
