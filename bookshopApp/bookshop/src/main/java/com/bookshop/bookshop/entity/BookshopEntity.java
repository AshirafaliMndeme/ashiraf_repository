package com.bookshop.bookshop.entity;


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
@Table(name = "BookshopDetails_table")
public class BookshopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String customerName;
    @Column(nullable = false)
    private String contactInfo;
    @Column(nullable = false)
    private LocalDate SalesDate;
    @Column(nullable = false)
    private Integer bookCost;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private String paymentMode;

}
