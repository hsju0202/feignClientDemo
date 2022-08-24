package com.example.feignclientdemo;

import lombok.Data;

@Data
public class KakaoPayApprovalResponse {

    private String aid;
    private String tid;
    private String cid;
    private String partner_order_id;
    private String partner_user_id;
}
