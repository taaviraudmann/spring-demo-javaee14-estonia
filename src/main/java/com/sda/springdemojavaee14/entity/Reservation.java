package com.sda.springdemojavaee14.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="RESERVATIONS")
public class Reservation {
    @Id // primary key
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long tableNumber; //we use Long because Long can be null, while long can't
    
    LocalDateTime startBookingTime;
    
    LocalDateTime endBookingTime;
    
    String surname;
    
    String phoneNumber;
    
    String email;
    
    int numberOfPeople;
    
    String address;

    // property - how it works in Java
    // property: firstname
    // getter: getFirstName
    // setter: setFirstName
    // backing field: name
//    private String name;
//
//    public String getFirstname() {
//        return name;
//    }
//
//    public void setFirstname(String name) {
//        this.name = name;
//    }
}
