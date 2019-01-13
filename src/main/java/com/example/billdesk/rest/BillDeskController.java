package com.example.billdesk.rest;

import com.example.billdesk.model.bill.Bill;
import com.example.billdesk.model.biller.Biller;
import com.example.billdesk.model.billeraccount.BillerAccount;
import com.example.billdesk.model.customer.Customer;
import com.example.billdesk.model.health.Health;
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

    @GetMapping("/health")
    public Health getHealth(){
        return healthService.getHealth();
    }

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


    //TODO: GET BILLS CHECK IT
    //TODO: MAKE PAYMENTS

}
