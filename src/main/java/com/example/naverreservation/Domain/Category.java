package com.example.naverreservation.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = "hibernateLazyInitializer")
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Transient
    private int count;
}
