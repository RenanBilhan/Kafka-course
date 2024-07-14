package com.renan.payment_service.service;

import com.renan.payment_service.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
