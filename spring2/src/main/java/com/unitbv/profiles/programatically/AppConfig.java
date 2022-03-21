package com.unitbv.profiles.programatically;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.ConfigurableEnvironment;

@Configuration
public class AppConfig {

    @Bean
    @Profile("dev")
    public DevDataSourceConfig devDataSourceConfig() {
        return new DevDataSourceConfig();
    }

    @Bean
    @Profile("prod")
    public ProdDataSourceConfig prodDataSourceConfig() {
        return new ProdDataSourceConfig();
    }

    @Bean
    @Profile("default")
    public DataSourceConfig dataSourceConfig() {
        return new DevDataSourceConfig();
    }
}
