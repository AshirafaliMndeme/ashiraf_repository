package com.booking.booking.service;
import com.booking.booking.entity.bookingEntity;

import java.util.List;

public interface BookingService {

        bookingEntity createBooking(bookingEntity BookingEntity);

        bookingEntity getBookingById(Long bookingId);

        List<bookingEntity> getAllBooking();

        bookingEntity updateBooking(bookingEntity BookingEntity);

        void deleteBooking(Long bookingId);
}
