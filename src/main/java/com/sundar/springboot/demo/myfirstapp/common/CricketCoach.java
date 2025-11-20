package com.sundar.springboot.demo.myfirstapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Primary
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 10 minutes :)";
    }
}