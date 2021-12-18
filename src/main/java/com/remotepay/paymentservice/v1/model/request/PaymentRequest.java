package com.remotepay.paymentservice.v1.model.request;

import lombok.Data;

@Data
public class PaymentRequest {
    private String paymentId;
    private String amount;
    private String taxAmount;
    private String serviceAmount;
    private String phoneNumber;
    
    private String productId;
}
