package com.example.feignclientdemo;

import lombok.Data;

@Data
public class KakaoPayApprovalRequest {

    private String cid = "TC0ONETIME";
    private String tid = "T3059ed60f5619158fdf";
    private String partner_order_id = "partner_order_id";
    private String partner_user_id = "partner_user_id";
    private String pg_token = "ef98697df18a96c906e5";
}
