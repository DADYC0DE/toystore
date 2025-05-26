package com.VGTU.toystore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000", "https://www.yourfrontenddomain.com") // Replace with actual frontend URLs
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"); // Specify allowed methods
            }
        };
    }
}
