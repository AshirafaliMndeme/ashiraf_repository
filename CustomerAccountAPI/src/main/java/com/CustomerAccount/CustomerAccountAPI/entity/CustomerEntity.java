package com.CustomerAccount.CustomerAccountAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer_details")


public class CustomerEntity {
    @Id
    //@jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String customerName;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private Integer cost;
    @Column(nullable = false)
    private String paymentstatus;
    @Column(nullable = false)
    private String paymentMode;

}
