package com.renan.payment_service.service.impl;

import com.renan.payment_service.model.Payment;
import com.renan.payment_service.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
@Slf4j
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;
    @Override
    @SneakyThrows
    public void sendPayment(Payment payment) {
        log.info("Recebi o pagamento {}.", payment);
        Thread.sleep(1000);

        log.info("Enviando pagamento");
        kafkaTemplate.send("payment-topic", payment);

    }
}
