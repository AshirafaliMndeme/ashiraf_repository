package com.CustomerAccount.CustomerAccountAPI.service;

import com.CustomerAccount.CustomerAccountAPI.entity.CustomerEntity;
import com.CustomerAccount.CustomerAccountAPI.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository;
   //private com.CustomerAccount.CustomerAccountAPI.entity.CustomerEntity CustomerEntity;

    @Override
    public CustomerEntity createCustomer(CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);

    }

    @Override
    public CustomerEntity getCustomerById(Long customerId) {
        Optional<CustomerEntity> optionalCustomerEntity = customerRepository.findById(customerId);
        return optionalCustomerEntity.get();
    }

    @Override
    public List<CustomerEntity> getAllcustomer() {
        return customerRepository.findAll();
    }

    @Override
    public CustomerEntity getCustomerNameById(Long customerId) {
        Optional<CustomerEntity> optionalCustomerEntity = customerRepository.findById(customerId);
        return optionalCustomerEntity.get();
    }

    @Override
    public List<CustomerEntity> getAllCustomer()  {
        return customerRepository.findAll();
    }

    @Override
    public CustomerEntity updateCustomer(CustomerEntity customerEntity) {
        CustomerEntity existingCustomer = customerRepository.findById(customerEntity.getId()).get();
        existingCustomer.setCustomerName(customerEntity.getCustomerName());
        existingCustomer.setPhoneNumber(customerEntity.getPhoneNumber());
        existingCustomer.setProductName(customerEntity.getProductName());
        existingCustomer.setCost(customerEntity.getCost());
        existingCustomer.setPaymentstatus(customerEntity.getPaymentstatus());
        existingCustomer.setPaymentMode(customerEntity.getPaymentMode());
       CustomerEntity updatedCustomer = customerRepository.save(existingCustomer);
        return updatedCustomer;
    }

    @Override
    public void deleteCustomer(Long CustomerId) {
        customerRepository.deleteById(CustomerId);
    }

}
