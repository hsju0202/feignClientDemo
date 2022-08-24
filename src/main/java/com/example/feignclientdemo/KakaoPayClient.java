package com.example.feignclientdemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "kakao-pay", url = "https://kapi.kakao.com", configuration = {FeignConfig.class})
public interface KakaoPayClient {

    @PostMapping(value = "/v1/payment/ready", consumes = "application/x-www-form-urlencoded;charset=utf-8")
    KakaoPayReadyResponse requestPayForReady(
            @RequestHeader("Authorization") String adminKey,
            @RequestBody KakaoPayReadyRequest request);

    @PostMapping(value = "/v1/payment/approve", consumes = "application/x-www-form-urlencoded;charset=utf-8")
    KakaoPayApprovalResponse requestPayForApproval(
            @RequestHeader("Authorization") String adminKey,
            @RequestBody KakaoPayApprovalRequest request);
}
