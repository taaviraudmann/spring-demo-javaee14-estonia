package com.sda.springdemojavaee14.homework.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalExerciseMain {

    public static void main(String[] args) {
        int nickLength = personNick() != null ? personNick().length() : 0;

        System.out.println("nick length is: " + nickLength);

        Optional<String> maybeNick = personNickIfPresent();
        if (maybeNick.isPresent()) {
            System.out.println(maybeNick.get());
        } else {
            System.out.println("Sorry, no nick");
        }
        if (maybeNick.isEmpty()){
            System.out.println("Sorry, no Nick");
        }else {
            System.out.println(maybeNick.get());
        }

        System.out.println("Better use of optional");
        System.out.println("nick "+ maybeNick.orElse("no nick"));

        System.out.println("Optional with lambda");
        maybeNick.ifPresent(new MyNickConsumer());

        // lambda is about reducing ceremony
        // lambda is for shorter version of providing interface implementations
        // lambda is content of missing interface method
        // we don't need type in lambda because we know which method we implement
        // -> (arrow) is a separator of arguments and method body

        System.out.println("Now with my own lambda");
        maybeNick.ifPresent(nick -> System.out.println("Nick is: " + nick));
        maybeNick.ifPresent((String nick) -> System.out.println("Nick is: " + nick));




    }
    // In Kotlin Language: String (never null) and String?
    public static String personNick() {
        return null;
    }

    // Optional is bag for just one item
    // we're using "factory methods" for creating instances of this class
    // factory method - is static method which is able to produce instances of classes and have good name
    public static Optional<String> personNickIfPresent() {
        return Optional.of("taavi");
    }
}

//generic interface consumer - t will be replaced with string in our case
class MyNickConsumer implements Consumer<String> {
    @Override
    public void accept(String t) {
        System.out.println("Nick is: " + t);
    }
}





