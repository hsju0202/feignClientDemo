package com.example.feignclientdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class KakaoPayClientTest {

    @Autowired
    private KakaoPayClient kakaoPayClient;

    @Test
    void requestPayForReady() {

        KakaoPayReadyRequest request = new KakaoPayReadyRequest();
        KakaoPayReadyResponse response = kakaoPayClient.requestPayForReady("KakaoAK ${adminKey}", request);
        System.out.println("response = " + response);
    }

    @Test
    void requestPayForApproval() {

        KakaoPayApprovalRequest request = new KakaoPayApprovalRequest();
        KakaoPayApprovalResponse response = kakaoPayClient.requestPayForApproval("KakaoAK ${adminKey}", request);
        System.out.println("response = " + response);
    }
}