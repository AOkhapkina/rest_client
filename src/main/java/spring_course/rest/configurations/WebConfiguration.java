package spring_course.rest.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("spring_course.rest")
public class WebConfiguration {
    // для совершения HTTP request из rest-client нужен вспомогательный класс RestTemplate, создаем бин этого класса/
// для совершения HTTP request прописать зависимость от этого бина в entity @autowired
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
