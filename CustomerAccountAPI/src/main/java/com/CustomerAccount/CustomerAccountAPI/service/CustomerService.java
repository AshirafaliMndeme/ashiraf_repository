package com.CustomerAccount.CustomerAccountAPI.service;
import com.CustomerAccount.CustomerAccountAPI.entity.CustomerEntity;

import java.util.List;


public interface CustomerService {
    CustomerEntity createCustomer(CustomerEntity customerEntity);

    CustomerEntity getCustomerById(Long CustomerId);

    List<CustomerEntity> getAllcustomer();

    CustomerEntity getCustomerNameById(Long customerId);

    List<CustomerEntity> getAllCustomer();

    CustomerEntity updateCustomer(CustomerEntity customerEntity);

    void deleteCustomer(Long CustomerId);

}