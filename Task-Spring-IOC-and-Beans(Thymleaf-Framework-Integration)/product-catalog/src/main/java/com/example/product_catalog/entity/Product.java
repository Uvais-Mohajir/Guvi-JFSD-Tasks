package com.example.product_catalog.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "product_catalog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false, name = "category")
    private String category;

}
