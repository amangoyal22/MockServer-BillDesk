package com.example.billdesk.rest;

import com.example.billdesk.model.bill.Bill;
import com.example.billdesk.model.biller.Biller;
import com.example.billdesk.model.billeraccount.BillerAccount;
import com.example.billdesk.model.customer.Customer;
import com.example.billdesk.model.health.Health;
import com.example.billdesk.model.oneview.Oneview;
import com.example.billdesk.model.payment.Payment;
import com.example.billdesk.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BillDeskController {

    @Autowired
    private HealthService healthService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private BillerListService billerListService;
    @Autowired
    private BillerAccountService billerAccountService;
    @Autowired
    private BillService billService;
    @Autowired
    private OneViewService oneViewService;
    @Autowired
    private PaymentService paymentService;

    //Done Hitting
    @GetMapping("/health")
    public Health getHealth(){
        return healthService.getHealth();
    }

    //Done Hitting
    @PostMapping("/addCustomer")
    public Customer addCust(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }
    @GetMapping("/viewCustomer")
    public Customer viewCust(){
        return customerService.viewCustomer();
    }
    @PutMapping("/modifyCustomer")
    public Customer modCust(@RequestBody Customer customer){
        return customerService.modifyCustomer(customer);
    }
    @DeleteMapping("/deleteCustomer")
    public Customer delCust(){
        return customerService.deleteCustomer();
    }

    //Done Hitting
    @GetMapping("/getBiller")
    public Biller gBiller(){
        return billerListService.getBiller();
    }
    @GetMapping("/getBillers")
    public Biller gBillers(){
        return billerListService.getBillers();
    }
    @GetMapping("/getBillersCat")
    public Biller gBillersC(){
        return billerListService.getBillersCategorically();
    }


    //Done Hitting
    @PostMapping("/createBillerAccount")
    public BillerAccount createBillerAcc(@RequestBody BillerAccount billerAccount){
        return billerAccountService.add_billerAccount(billerAccount);
    }
    @PostMapping("/activateBillerAccount")
    public BillerAccount activateBillerAcc(@RequestBody BillerAccount billerAccount){
        return billerAccountService.activate_billerAccount(billerAccount);
    }
    @GetMapping("/getBillerAccount")
    public BillerAccount getBillerAcc(){
        return billerAccountService.retrieve_billerAccount();
    }
    @GetMapping("/geBillerAccounts")
    public BillerAccount getBillerAccs(){
        return billerAccountService.all_billerAccounts();
    }
    @PutMapping("/modifyBillerAccount")
    public BillerAccount modifyBillerAcc(@RequestBody BillerAccount billerAccount){
        return billerAccountService.modify_billerAccounts(billerAccount);
    }
    @DeleteMapping("/activateBillerAccount")
    public BillerAccount deleteBillerAcc(){
        return billerAccountService.delete_billerAccount();
    }





    @GetMapping("/getBill")
    public Bill getBill(){
        return billService.getBill();
    }
    @GetMapping("/geBills")
    public Bill getBills(){
        return billService.getBills();
    }


    @GetMapping("/oneview")
    public Oneview getOneView(){ return oneViewService.getOneview();}


    @PostMapping("/makepayment")
    public Payment makepayment(Payment payment){return paymentService.makePayment(payment);}
    @PutMapping("/authpayment")
    public Payment authpayment(Payment payment){return paymentService.authPayment(payment);}
    @GetMapping("/retrievepayment")
    public Payment retrievepayment(){return paymentService.retrievePayment();}
    @GetMapping("/listpayment")
    public Payment listpayment(){return paymentService.listPayment();}
    @PutMapping("/modifypayment")
    public Payment modifypayment(Payment payment){return paymentService.modifyPayment(payment);}
    @DeleteMapping("/deletepayment")
    public Payment deletepayment(){return paymentService.stopPayment();}
    @GetMapping("/resendOTP")
    public Payment resendOTP(){return paymentService.rOtpPayment();}



    //TODO: GET BILLS CHECK IT
    //TODO: MAKE PAYMENTS Check IT
    //TODO: MAKE ONEVIEW CHECK IT
    //TODO: MAKE VALIDITION
    //TODO: Auto Pay ask adarsh

}
