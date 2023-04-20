package com.booking.booking.service;

import com.booking.booking.entity.bookingEntity;
import com.booking.booking.repository.bookingrepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookingServiceImpl implements BookingService{
    private bookingrepository Bookingrepository;
    @Override
    public bookingEntity createBooking(bookingEntity BookingEntity) {
        return Bookingrepository.save(BookingEntity);

    }

    @Override
    public bookingEntity getBookingById(Long BookingId) {
        Optional<bookingEntity> optionalBookingEntity = Bookingrepository.findById(BookingId);
        return optionalBookingEntity.get();
    }

    @Override
    public List<bookingEntity> getAllBooking()  {
        return Bookingrepository.findAll();
    }

    @Override
    public bookingEntity updateBooking(bookingEntity BookingEntity) {
        bookingEntity existingBooking = Bookingrepository.findById(BookingEntity.getId()).get();
        existingBooking.setCustomerName(BookingEntity.getCustomerName());
        existingBooking.setBookingdate(BookingEntity.getBookingdate());
        existingBooking.setRoomtype(BookingEntity.getRoomtype());
        existingBooking.setCost(BookingEntity.getCost());
        existingBooking.setPaymentstatus(BookingEntity.getPaymentstatus());
        existingBooking.setStatus(BookingEntity.getStatus());
        existingBooking.setPaymentMode(BookingEntity.getPaymentMode());
        return null;
    }

    @Override
    public void deleteBooking(Long bookingId) {
        Bookingrepository.deleteById(bookingId);
    }
}
