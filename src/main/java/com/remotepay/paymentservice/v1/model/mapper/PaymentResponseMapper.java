package com.remotepay.paymentservice.v1.model.mapper;

import com.remotepay.paymentservice.v1.model.entity.PaymentEntity;
import com.remotepay.paymentservice.v1.model.response.PaymentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaymentResponseMapper extends GenericMapper<PaymentResponse, PaymentEntity> {
	@Override
	@Mapping(source = "phone_number", target = "phone_num")
	// 변수명이 다를 때 하나하나 source, target name을 지정해줘야 한다.
	PaymentResponse toDto(PaymentEntity paymentEntity);
}
