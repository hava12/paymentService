package com.remotepay.paymentservice.v1.controller;

import com.remotepay.paymentservice.v1.model.entity.PaymentEntity;
import com.remotepay.paymentservice.v1.model.mapper.PaymentResponseMapper;
import com.remotepay.paymentservice.v1.model.repository.PaymentRepository;
import com.remotepay.paymentservice.v1.model.response.PaymentResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/payment/v1/")
@RequiredArgsConstructor
public class PaymentController {

	private final PaymentRepository paymentRepository;
	private final PaymentResponseMapper paymentResponseMapper;

	@GetMapping("payment/{id}")
	public ResponseEntity<PaymentResponse> getPaymentData(@PathVariable Long id) {

		System.out.println(id);

		PaymentEntity paymentEntity = paymentRepository.getById(id);
		System.out.println("paymentEntity = " + paymentEntity);

		PaymentResponse paymentResponse = paymentResponseMapper.toDto(paymentEntity);

		System.out.println("paymentResponse = " + paymentResponse);
		return new ResponseEntity<>(paymentResponse, HttpStatus.OK);
	}
}
