package com.booking.booking.controller;


import com.booking.booking.entity.bookingEntity;
import com.booking.booking.service.BookingService;
import com.booking.booking.service.BookingServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.booking.booking.service.BookingService.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/booking")
public class BookingController {

    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<bookingEntity>createBooking(bookingEntity BookingEntity){
        bookingEntity savedBooking = bookingService.createBooking(BookingEntity);
        return new ResponseEntity<>(BookingEntity, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<bookingEntity>> getAllBooking(){
        List<bookingEntity> BookingEntity = bookingService.getAllBooking();
        return new ResponseEntity<>(BookingEntity, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<bookingEntity> updatebookingEntity(@PathVariable("id")Long BookingId,@RequestParam
    bookingEntity BookingEntity){
        BookingEntity.setId(BookingId);
        bookingEntity updatebookingEntity = bookingService.updateBooking(BookingEntity);

        return new ResponseEntity<>(updatebookingEntity, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deletebookingEntity(@PathVariable("id")Long BookingId)
    {
        bookingService.deleteBooking(BookingId);
        return new ResponseEntity<>( "Booking detail successifuly deleted", HttpStatus.OK);
    }

}
