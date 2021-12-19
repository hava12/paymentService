package com.remotepay.paymentservice.v1.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name="payment")
public class PaymentEntity {

    @Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private Long payment_id;

    @Column
    private String product_id;

    @Column
    private String pay_amount;

    @Column
    private String tax_amount;

    @Column
    private String service_amount;

    @Column
    private String phone_number;
}
