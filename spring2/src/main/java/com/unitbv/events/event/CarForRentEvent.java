package com.unitbv.events.event;

import com.unitbv.events.model.Car;
import com.unitbv.events.service.PersonService;
import org.springframework.context.ApplicationEvent;

public class CarForRentEvent extends ApplicationEvent {
    private Car car;

    public CarForRentEvent(PersonService personService, Object source) {
        super(source);
    }

    public Car getCar() {
        return car;
    }
}
