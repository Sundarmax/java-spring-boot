package com.sundar.springboot.demo.myfirstapp.rest;

import com.sundar.springboot.demo.myfirstapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // define a private filed for the dependency
    private Coach myCoach;
    private Coach myCoach2;
//    @Autowired
//    public FunRestController(Coach theCoach) {
//        myCoach = theCoach;
//    }

    // define a constructor for the dependency injection.
    @Autowired
    public FunRestController(@Qualifier("trackCoach") Coach theCoach,
                             @Qualifier("trackCoach") Coach theAnotherCoach) {
            myCoach = theCoach;
            myCoach2 = theAnotherCoach;
    }

    // setter injection
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return  "Hello World !";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans : myCoach == myCoach2 , " + (myCoach == myCoach2);
    }
}
