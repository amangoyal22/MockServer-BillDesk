package com.example.billdesk.service;

import com.example.billdesk.header.HeaderGene;
import com.example.billdesk.model.bill.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class Bill_Imp implements BillService {

    @Value("${mock.base_url}")
    private String baseurl;

    @Value("${billdesk.get_bill_p1}")
    private String GET_BILL_P1;
    @Value("${billdesk.get_bill_p2}")
    private String GET_BILL_P2;


    @Autowired
    private HeaderGene headerGene;
    @Autowired
    private RestTemplate Template;



    @Override
    public Bill getBill(){
        String customerID = "123456";
        String Bill = "REF0000000001";//TODO: take from records
        String url = GET_BILL_P1+customerID+GET_BILL_P2+Bill;
        HttpHeaders headers = headerGene.headergenrator("","GET", url);
        HttpEntity<Bill> entity = new HttpEntity<>(headers);
        //TODO: MAP Accordding to JSON
       // System.out.println(entity.toString());
       // System.out.println(baseurl+url);
        ResponseEntity<Bill> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.GET, entity, Bill.class);
        //System.out.println(response.getBody());
        return response.getBody();
    }


    @Override
    public List<Bill> getBills(){
        String customerID = "123456";
        String url = GET_BILL_P1+customerID+GET_BILL_P2;
        HttpHeaders headers = headerGene.headergenrator("","GET", url);
        HttpEntity<Bill> entity = new HttpEntity<>(headers);
        //TODO: MAP Accordding to JSON
        System.out.println(entity.toString());
        System.out.println(baseurl+url);
        ResponseEntity<List<Bill>> response = Template.exchange(baseurl+url,HttpMethod.GET//TODO: change to original api
                ,entity,new ParameterizedTypeReference<List<Bill>>(){});
        //System.out.println(response.getBody());
        return response.getBody();
    }
}
