package com.without.lookup;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class MyPrototypeBean {

    private String dateTimeString = LocalDateTime.now().toString();

    public String getDateTime() {
        return dateTimeString;
    }
}
