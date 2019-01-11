package com.example.billdesk.service;


import com.example.billdesk.model.health.Health;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


public interface HealthService {
    public Health getHealth();
}
