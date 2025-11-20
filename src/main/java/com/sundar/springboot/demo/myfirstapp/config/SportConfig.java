package com.sundar.springboot.demo.myfirstapp.config;

import com.sundar.springboot.demo.myfirstapp.common.Coach;
import com.sundar.springboot.demo.myfirstapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("sundarmax")
    public Coach swimCoach() {
        return  new SwimCoach();
    }
}
