package com.example.feignclientdemo;

import lombok.Data;

@Data
public class KakaoPayReadyRequest {

    private String cid = "TC0ONETIME";
    private String partner_order_id = "partner_order_id";
    private String partner_user_id = "partner_user_id";
    private String item_name = "초코파이";
    private String quantity = "1";
    private String total_amount = "2200";
    private String vat_amount = "200";
    private String tax_free_amount = "0";
    private String approval_url = "http://localhost:8080";
    private String fail_url = "http://localhost:8080";
    private String cancel_url = "http://localhost:8080";
}
