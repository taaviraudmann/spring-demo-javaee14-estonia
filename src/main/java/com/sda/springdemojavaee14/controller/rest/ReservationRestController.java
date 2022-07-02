package com.sda.springdemojavaee14.controller.rest;

import com.sda.springdemojavaee14.entity.Reservation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")

public class ReservationRestController {

    @GetMapping("/reservations")
    public List<Reservation> getAllReservations() {
        log.info("getting all reservations");
        return List.of(
                Reservation.builder()
                        .id(1L)
                        .tableNumber(12L)
                        .startBookingTime(LocalDateTime.now())
                        .endBookingTime(LocalDateTime.now().plusHours(2))
                        .surname("Raudmann")
                        .phoneNumber("555 555 555")
                        .email("email@email.com")
                        .numberOfPeople(5)
                        .address("Park road 5")
                        .build()
        );
    }
}
