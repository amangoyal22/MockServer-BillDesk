package com.example.billdesk.service;

import com.example.billdesk.header.HeaderGene;
import com.example.billdesk.model.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ValidationImp implements ValidationService {


    @Value("${mock.base_url}")
    private String baseurl;

    @Value("${billdesk.make_payment_p1}")
    private String VL_PYMENT_P1;
    @Value("${billdesk.make_payment_p2}")
    private String VL_PYMENT_P2;


    @Autowired
    private HeaderGene headerGene;
    @Autowired
    private RestTemplate Template;


    @Override
    public Validation validatePayment(Validation validation){
        String customerID = "123456";//TODO: take from records
        String url = VL_PYMENT_P1+customerID+VL_PYMENT_P2;
        HttpHeaders headers = headerGene.headergenrator(validation.toString(),"POST", url);
        HttpEntity<Validation> entity = new HttpEntity<>(validation,headers);
        //TODO: MAP Accordding to JSON
        ResponseEntity<Validation> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.POST, entity, Validation.class);
        //System.out.println(response.getBody());
        return response.getBody();

    }

}
