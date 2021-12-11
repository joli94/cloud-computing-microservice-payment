package ro.unibuc.fmi.dietapp.microservice.payment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.unibuc.fmi.dietapp.microservice.payment.mapper.PaymentMapper;
import ro.unibuc.fmi.dietapp.microservice.payment.mapper.PaymentMapperImpl;

@Configuration
public class ProjectConfig {
    @Bean
    public PaymentMapper paymentMapper() {
        return new PaymentMapperImpl();
    }
}