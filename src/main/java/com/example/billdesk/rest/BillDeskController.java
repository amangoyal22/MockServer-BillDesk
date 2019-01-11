package com.example.billdesk.rest;

import com.example.billdesk.model.health.Health;
import com.example.billdesk.service.HealthImp;
import com.example.billdesk.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BillDeskController {

    @Autowired
    private HealthService healthService;

    @GetMapping("/health")
    public Health geHealth(){
        return healthService.getHealth();
    }
}
