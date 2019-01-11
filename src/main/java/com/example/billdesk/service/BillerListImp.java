package com.example.billdesk.service;

import com.example.billdesk.header.HeaderGene;
import com.example.billdesk.model.biller.Biller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BillerListImp implements BillerListService{

    @Value("${mock.base_url}")
    private String baseurl;
    @Value("${billdesk.get_biller}")
    private String GET_BILLER;

    @Value("${billdesk.get_billers}")
    private String GET_BILLERS;

    @Value("${billdesk.get_billers_category}")
    private String GET_BILLERS_CAT;



    @Autowired
    private HeaderGene headerGene;
    @Autowired
    private RestTemplate Template;



    @Override
    public Biller getBiller(){
        //TODO: Biller ID needed to be fetched
        String id = "RELENG";

        HttpHeaders headers = headerGene.headergenrator("","GET", GET_BILLER+id);

        HttpEntity<Biller> entity = new HttpEntity<>(headers);

        System.out.println(entity.toString()+"\n" +baseurl+GET_BILLER+id);

        //TODO: MAP Accordding to JSON
        ResponseEntity<Biller> response = Template.exchange(baseurl+GET_BILLER+id,//TODO: change to original api
                HttpMethod.GET, entity, Biller.class);
        //System.out.println(response.getBody());

        return response.getBody();
    }



    @Override
    public Biller getBillers(){

        HttpHeaders headers = headerGene.headergenrator("","GET", GET_BILLERS);
        HttpEntity<Biller> entity = new HttpEntity<>(headers);
        System.out.println(entity.toString()+"\n" +baseurl+GET_BILLERS);
        //TODO: MAP Accordding to JSON
        ResponseEntity<Biller> response = Template.exchange(baseurl+GET_BILLERS,//TODO: change to original api
                HttpMethod.GET, entity, Biller.class);
        return response.getBody();

    }
    @Override
    public Biller getBillersCategorically(){
        //TODO: Get Category
        String category = "Electricity";
        HttpHeaders headers = headerGene.headergenrator("","GET", GET_BILLERS_CAT+category);
        HttpEntity<Biller> entity = new HttpEntity<>(headers);

        System.out.println(entity.toString()+"\n" +baseurl+GET_BILLERS_CAT+category);

        //TODO: MAP Accordding to JSON
        ResponseEntity<Biller> response = Template.exchange(baseurl+GET_BILLERS_CAT+category,//TODO: change to original api
                HttpMethod.GET, entity, Biller.class);

        return response.getBody();
    }

}
