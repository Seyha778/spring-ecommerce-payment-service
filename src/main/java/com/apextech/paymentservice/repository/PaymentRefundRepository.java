package com.apextech.paymentservice.repository;

import com.apextech.paymentservice.entity.PaymentRefundEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PaymentRefundRepository
        extends JpaRepository<PaymentRefundEntity, Long> {

    List<PaymentRefundEntity> findAllByPaymentIdOrderByIdDesc(
            String paymentId
    );

    Optional<PaymentRefundEntity> findByRefundReference(
            String refundReference
    );

    boolean existsByRefundReference(String refundReference);
}