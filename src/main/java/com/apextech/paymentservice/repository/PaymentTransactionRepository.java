package com.apextech.paymentservice.repository;

import com.apextech.paymentservice.entity.PaymentTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PaymentTransactionRepository
        extends JpaRepository<PaymentTransactionEntity, Long> {

    List<PaymentTransactionEntity> findAllByPaymentIdOrderByIdDesc(
            String paymentId
    );

    Optional<PaymentTransactionEntity> findByTransactionReference(
            String transactionReference
    );
}