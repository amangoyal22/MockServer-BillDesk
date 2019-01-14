package com.example.billdesk.service;

import com.example.billdesk.model.validation.Validation;

public interface ValidationService {
    public Validation validatePayment(Validation validation);
}
