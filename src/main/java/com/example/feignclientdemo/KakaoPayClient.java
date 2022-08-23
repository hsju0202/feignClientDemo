package com.example.feignclientdemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "kakao-pay", url = "https://kapi.kakao.com")
public interface KakaoPayClient {

    @PostMapping(value = "/v1/payment/ready", produces = "application/json")
    KakaoPayResponseDTO requestPay(
            @RequestHeader("Authorization") String adminKey,
            @RequestBody KakaoPayRequestDTO request);
}
