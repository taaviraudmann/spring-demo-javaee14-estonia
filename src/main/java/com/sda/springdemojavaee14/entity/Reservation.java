package com.sda.springdemojavaee14.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
