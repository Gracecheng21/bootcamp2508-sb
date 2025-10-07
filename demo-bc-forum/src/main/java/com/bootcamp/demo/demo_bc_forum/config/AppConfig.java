package com.bootcamp.demo.demo_bc_forum.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
  @Bean // outer class
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

}
