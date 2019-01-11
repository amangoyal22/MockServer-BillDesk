package com.example.billdesk.service;

import com.example.billdesk.model.biller.Biller;

public interface BillerListService {
    public Biller getBiller();
    public Biller getBillers();
    public Biller getBillersCategorically();

}
