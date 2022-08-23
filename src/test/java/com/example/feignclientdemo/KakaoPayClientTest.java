package com.example.feignclientdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KakaoPayClientTest {

    @Autowired
    private KakaoPayClient kakaoPayClient;

    @Test
    void requestPay() {

        KakaoPayRequestDTO request = new KakaoPayRequestDTO();

        KakaoPayResponseDTO kakaoPayResponseDTO = kakaoPayClient.requestPay("KakaoAK c3c1fcb48b30dfb68e37449cc31dffa3", request);
        System.out.println("kakaoPayResponseDTO = " + kakaoPayResponseDTO);
    }
}