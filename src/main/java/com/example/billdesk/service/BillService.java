package com.example.billdesk.service;

import com.example.billdesk.model.bill.Bill;

import java.util.List;

public interface BillService {
    public Bill getBill();
    public List<Bill> getBills();
}
