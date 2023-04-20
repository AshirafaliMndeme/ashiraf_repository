package com.booking.booking.repository;
import com.booking.booking.entity.bookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookingrepository extends JpaRepository<bookingEntity, Long> {

}
