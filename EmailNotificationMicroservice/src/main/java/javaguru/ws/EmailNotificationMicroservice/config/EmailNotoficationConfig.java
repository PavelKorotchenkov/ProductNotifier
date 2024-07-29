package javaguru.ws.EmailNotificationMicroservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmailNotoficationConfig {

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
