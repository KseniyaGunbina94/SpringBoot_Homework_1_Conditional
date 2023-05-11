package netology.ru.SpringBoot_Homework_1_Conditional.Config;

import netology.ru.SpringBoot_Homework_1_Conditional.Profile.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @ConditionalOnProperty("netology.profile.dev")
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }
    @ConditionalOnProperty("netology.profile.prod")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}

