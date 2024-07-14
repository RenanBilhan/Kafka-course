package com.renan.payment_service.service.impl;

import com.renan.payment_service.model.Payment;
import com.renan.payment_service.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT SERVICE IMPL: recebendo pagamento {}.", payment);
    }
}
