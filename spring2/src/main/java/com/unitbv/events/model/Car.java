package com.unitbv.events.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private final String model;

    public Car(String model) {
        this.model = model;
    }
}
