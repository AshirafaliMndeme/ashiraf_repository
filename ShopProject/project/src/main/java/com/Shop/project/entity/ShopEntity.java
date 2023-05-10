package com.Shop.project.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shopInfo_details")
public class ShopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String customername;
    @Column(nullable = false)
    private String productInfo;
    @Column(nullable = false)
    private LocalDate shopingDate;
    @Column(nullable = false)
    private String productCost;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private String paymentMode;
}
