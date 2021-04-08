package com.example.naverreservation.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservation_info")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private DisplayInfo displayInfo;

    @ManyToOne
    private User user;

    private LocalDateTime reservationDate;
    private Boolean cancleFlag;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
}
