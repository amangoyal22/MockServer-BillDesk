package com.example.billdesk.service;

import com.example.billdesk.header.HeaderGene;
import com.example.billdesk.model.health.Health;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HealthImp implements HealthService{

    @Value("${mock.base_url}")
    private String baseurl;

    @Value("${billdesk.health_api}")
    private String HEALTH_API;


    @Autowired
    private HeaderGene headerGene;

    @Autowired
    private RestTemplate Template;
    @Override
    public Health getHealth(){

        ///body will be json file.
        HttpHeaders headers = headerGene.headergenrator("","GET", HEALTH_API);
        HttpEntity<Health> entity = new HttpEntity<>(headers);
        // Send request with GET method, and Headers.
        System.out.println(entity.toString()+"\n" +baseurl+HEALTH_API);
        ResponseEntity<Health> response = Template.exchange(baseurl+HEALTH_API,//TODO: change to original api
               HttpMethod.GET, entity, Health.class);

       // ResponseEntity<String> response = Template.exchange(baseurl+HEALTH_API,//TODO: change to original api
         //         HttpMethod.GET, entity, String.class);
       // System.out.print(response.getBody());
        return response.getBody();

    }

    @Bean
    public RestTemplate rest(){
        return new RestTemplate();
    }
}
