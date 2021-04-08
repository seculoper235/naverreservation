package com.example.naverreservation.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "reservation_user_comment_image")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommentImage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private FileInfo fileInfo;

    @ManyToOne
    private ReservationInfo reservationInfo;

    @ManyToOne
    private Comment comment;
}
