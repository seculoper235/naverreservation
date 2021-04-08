package com.example.naverreservation.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "display_info_image")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DisplayInfoImage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private DisplayInfo displayInfo;

    @ManyToOne
    private FileInfo fileInfo;
}
