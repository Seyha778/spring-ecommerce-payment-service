package com.apextech.paymentservice.repository;

import com.apextech.paymentservice.entity.PaymentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PaymentRepository
        extends JpaRepository<PaymentEntity, Long> {

    Optional<PaymentEntity> findByPaymentNumber(String paymentNumber);

    Optional<PaymentEntity> findByIdempotencyKey(String idempotencyKey);

    Page<PaymentEntity> findAllByCustomerIdOrderByIdDesc(
            UUID customerId,
            Pageable pageable
    );

    boolean existsByPaymentNumber(String paymentNumber);
}