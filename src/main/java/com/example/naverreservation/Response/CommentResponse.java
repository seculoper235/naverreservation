package com.example.naverreservation.Response;

import com.example.naverreservation.Domain.CommentImage;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter @Setter
public class CommentResponse {
    private int id;
    private String name;
    private CommentImage commentImage;
    private int score;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

    private int productId;
    private int reservationId;
}
