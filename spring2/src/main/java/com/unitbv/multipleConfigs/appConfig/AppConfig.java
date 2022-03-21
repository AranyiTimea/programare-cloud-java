package com.unitbv.multipleConfigs.appConfig;

import com.unitbv.multipleConfigs.BeanB;
import com.unitbv.multipleConfigs.BeanA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.unitbv.multipleConfigs.appConfig")
public class AppConfig {
    @Bean("beanA")
    public BeanA beanA() {
        return new BeanA();
    }

    @Bean("beanB")
    public BeanB beanB() {
        return new BeanB();
    }
}
