package com.unitbv.events.configuration;

import com.unitbv.events.service.CarService;
import com.unitbv.events.service.PersonService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    private ApplicationEventPublisher eventPublisher;

    @Bean
    public PersonService personService()
    {
        return new PersonService(eventPublisher);
    }

    @Bean
    public CarService carService()
    {
        return new CarService();
    }
}
