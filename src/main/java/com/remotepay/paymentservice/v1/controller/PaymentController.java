package com.remotepay.paymentservice.v1.controller;

import com.remotepay.paymentservice.v1.model.response.PaymentResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/payment/v1/")
public class PaymentController {

	@GetMapping("payment/{id}")
	public ResponseEntity<PaymentResponse> getPaymentData(@PathVariable String id) {

		System.out.println(id);

		return new ResponseEntity<>(new PaymentResponse(), HttpStatus.OK);
	}
}
