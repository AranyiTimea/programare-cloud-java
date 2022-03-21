package com.unitbv.profiles.automatically;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@PropertySource("classpath:profiles.properties")
public class AppConfig {

}
