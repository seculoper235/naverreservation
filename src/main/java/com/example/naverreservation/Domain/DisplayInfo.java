package com.example.naverreservation.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "display_info")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DisplayInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "display_info")
    private List<Product> products = new ArrayList<>();

    private String openingHours;
    private String placeName;
    private String placeLot;
    private String placeStreet;

    private String tel;
    private String homepage;
    private String email;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
}
