package com.min.aiproject.config;

import com.google.auto.value.AutoAnnotation;
import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.properties.SwaggerUiConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Autowired
    SwaggerUiConfigProperties swaggerUiConfigProperties;

    @Bean
    GroupedOpenApi openApi() {
        return GroupedOpenApi.builder()
                .group("API")
                .pathsToMatch("/**")
                .build();
    }
}
