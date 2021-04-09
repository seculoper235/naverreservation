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
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "display_info_id")
    private DisplayInfo displayInfo;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime reservationDate;
    private Boolean cancelFlag;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
}
