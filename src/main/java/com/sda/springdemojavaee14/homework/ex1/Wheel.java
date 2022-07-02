package com.sda.springdemojavaee14.homework.ex1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Component("ratas")
@Scope (SCOPE_PROTOTYPE) //Scope will create as many wheels as we need, as many as we have defined
public class Wheel {

    public Wheel() {
        System.out.println("Creating new wheel");
    }
}
