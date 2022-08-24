package com.example.feignclientdemo;

import feign.codec.Encoder;
import feign.form.FormEncoder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@RequiredArgsConstructor
@Configuration
public class FeignConfig {

    private final ObjectFactory<HttpMessageConverters> messageConverters;

    @Bean
    public Encoder formEncoder()
    {
        return new FormEncoder(new SpringEncoder(this.messageConverters));
    }
}
