package com.sda.springdemojavaee14.homework.annotation;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        PersonWithAllSourceCode me = new PersonWithAllSourceCode();
        me.setName("Taavi");
        me.setSurname("Raudmann");
        me.setAge(35);

        System.out.println("me: " + me.toString());

        PersonWithAllSourceCode anotherMe = new PersonWithAllSourceCode("Taavi", "Raudmann", 35);

        System.out.println("another me: "+ anotherMe);

        System.out.println("Are those two references refer to the same object: " + (me==anotherMe));
        System.out.println("is this the same person?-" + me.equals(anotherMe));

        System.out.println("are equals: " + me.equals("haha"));

        Person meAgain = new Person("Taavi", "Raudmann", 35);
        //Builder is better than all args constructor - because you can see more :)
        Person meAgainWithBuilder = Person.builder()
                .age(35)
                .surname("Raudmann")
                .name("Taavi")
                .build();
        // Set doesn't store duplicates
        Set<PersonWithAllSourceCode> uniquePersons = new HashSet<>();
        uniquePersons.add(me);
        uniquePersons.add(anotherMe);// me will be replaced by anotherMe
        System.out.println("set size, after adding two equal Persons: "+ uniquePersons.size());
    }
}
