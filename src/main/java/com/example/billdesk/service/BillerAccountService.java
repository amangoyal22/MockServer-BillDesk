package com.example.billdesk.service;


import com.example.billdesk.model.billeraccount.BillerAccount;

public interface BillerAccountService {
    public BillerAccount add_billerAccount(BillerAccount billerAccount);
    public BillerAccount activate_billerAccount(BillerAccount billerAccount);
}
