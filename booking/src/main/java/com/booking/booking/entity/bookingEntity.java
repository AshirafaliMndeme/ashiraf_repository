package com.booking.booking.entity;

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
    @Table(name = "booking_details")
    public class bookingEntity {
        @Id
        //@jakarta.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Id;
        @Column(nullable = false)
        private String customerName;
        @Column(nullable = false)
        private String bookingdate;
        @Column(nullable = false)
        private String roomtype;
        @Column(nullable = false)
        private Integer cost;
        @Column(nullable = false)
        private String paymentstatus;
        @Column(nullable = false)
        private String status;
        @Column(nullable = false)
        private String paymentMode;
}
