package com.andersondev.paymentservice.service;

import com.andersondev.paymentservice.model.Payment;

public interface PaymentService {

	void sendPayment(Payment payment);
}
