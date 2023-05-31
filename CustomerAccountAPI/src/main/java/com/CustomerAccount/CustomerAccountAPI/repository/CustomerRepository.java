package com.CustomerAccount.CustomerAccountAPI.repository;
import com.CustomerAccount.CustomerAccountAPI.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<CustomerEntity, Long> {
   /* static CustomerEntity list(CustomerEntity customerEntity) //
    {
        return customerEntity;
    }*/
}
