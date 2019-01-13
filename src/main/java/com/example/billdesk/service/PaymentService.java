package com.example.billdesk.service;

import com.example.billdesk.model.payment.Payment;

public interface PaymentService {
    public Payment makePayment(Payment payment);
    public Payment authPayment(Payment payment);
    public Payment retrievePayment();
    public Payment listPayment();
    public Payment modifyPayment(Payment payment);
    public Payment stopPayment(Payment payment);
    public Payment rOtpPayment();
}
