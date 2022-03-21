package com.unitbv.properties.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class Car {
    private String model;

    public Car(@Value("{$ car.model}")String model) {
        this.model = model;
    }
}
