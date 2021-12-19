package com.remotepay.paymentservice.v1.model.repository;

import com.remotepay.paymentservice.v1.model.entity.PaymentEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

	@Override
	List<PaymentEntity> findAllById(Iterable<Long> longs);

	@Override
	PaymentEntity getById(Long aLong);
}
