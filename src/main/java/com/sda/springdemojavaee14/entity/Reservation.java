package com.sda.springdemojavaee14.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class Reservation {
    Long id;

    Long tableNumber; //we use Long because Long can be null, while long can't

    LocalDateTime startBookingTime;

    LocalDateTime endBookingTime;

    String surname;

    String phoneNumber;

    String email;

    int numberOfPeople;

    String address;
}
