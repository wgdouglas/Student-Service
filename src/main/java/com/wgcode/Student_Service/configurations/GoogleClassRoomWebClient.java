package com.wgcode.Student_Service.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class GoogleClassRoomWebClient {

    @Value("${googleClassroom.api.endpoint}")
    private String googleClassRoomBaseUrl;

    @Bean
    public WebClient googleClassRoomWebClient() {
        return WebClient.builder()
                .baseUrl(googleClassRoomBaseUrl)
                .exchangeStrategies(ExchangeStrategies.builder()
                        .build()).build();
    }
}
