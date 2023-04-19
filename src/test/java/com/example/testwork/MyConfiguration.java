package com.example.testwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public User user() {
        String login = "name";
        String email = "arasa@yandex.ru";
        return new User(login, email);
    }

}
