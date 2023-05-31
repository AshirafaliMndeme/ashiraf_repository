package com.CustomerAccount.CustomerAccountAPI.controller;

import com.CustomerAccount.CustomerAccountAPI.entity.CustomerEntity;
import com.CustomerAccount.CustomerAccountAPI.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/booking")

public class CustomerController {
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerEntity>createCustomer(@RequestBody CustomerEntity customerEntity){
        CustomerEntity savedCustomer = customerService.createCustomer(customerEntity);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<CustomerEntity>> getAllCustomer(){
        List<CustomerEntity> customerEntities = customerService.getAllcustomer();
        return new ResponseEntity<>(customerEntities, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerEntity> getcutomerByid(@PathVariable("id") Long customerId,@RequestBody CustomerEntity customerEntity){
        CustomerEntity getCustomerById= customerService.getCustomerById(customerId);
        return new ResponseEntity<>(customerEntity,HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<CustomerEntity> updatecustomerEntity(@PathVariable("id")Long customerId,@RequestBody
    CustomerEntity customerEntity){
       customerEntity.setId(customerId);
        CustomerEntity updatecustomerEntity = customerService.updateCustomer(customerEntity);
        return new ResponseEntity<>(updatecustomerEntity, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deletecustomerEntity(@PathVariable("id")Long CustomerId)
    {
        customerService.deleteCustomer(CustomerId);
        return new ResponseEntity<>( "Customer detail successifuly deleted", HttpStatus.OK);
    }
}
