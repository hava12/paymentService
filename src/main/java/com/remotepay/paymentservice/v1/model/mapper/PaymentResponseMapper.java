package com.remotepay.paymentservice.v1.model.mapper;

import com.remotepay.paymentservice.v1.model.entity.PaymentEntity;
import com.remotepay.paymentservice.v1.model.response.PaymentResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentResponseMapper extends GenericMapper<PaymentResponse, PaymentEntity> {

}
