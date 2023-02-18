package ru.netology.sprinbootdemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaConfig {

    @Bean
    @ConditionalOnProperty("true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty("false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
