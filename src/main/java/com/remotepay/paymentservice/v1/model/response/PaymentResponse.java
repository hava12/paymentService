package com.remotepay.paymentservice.v1.model.response;

import javax.persistence.Column;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PaymentResponse {
	private Long payment_id;
	private String product_id;
	private String pay_amount;
	private String tax_amount;
	private String service_amount;
	private String phone_number;
}
