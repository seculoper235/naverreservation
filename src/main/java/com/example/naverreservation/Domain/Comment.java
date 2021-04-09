package com.example.naverreservation.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "reservation_user_comment")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;
    private Double score;

    @OneToMany(mappedBy = "id")
    private List<CommentImage> commentImages = new ArrayList<>();

    @OneToMany(mappedBy = "id")
    private List<Product> products;

    @ManyToOne
    private ReservationInfo reservationInfo;
}
