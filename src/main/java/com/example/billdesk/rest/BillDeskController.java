package com.example.billdesk.rest;

import com.example.billdesk.model.biller.Biller;
import com.example.billdesk.model.customer.Customer;
import com.example.billdesk.model.health.Health;
import com.example.billdesk.service.BillerListService;
import com.example.billdesk.service.CustomerService;
import com.example.billdesk.service.HealthImp;
import com.example.billdesk.service.HealthService;
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

}
