package com.example.billdesk.service;

import com.example.billdesk.header.HeaderGene;
import com.example.billdesk.model.oneview.Oneview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class OneViewImp implements OneViewService {

    @Value("${mock.base_url}")
    private String baseurl;

    @Value("${billdesk.oneview_p1}")
    private String GET_ONEVIEW;



    @Autowired
    private HeaderGene headerGene;
    @Autowired
    private RestTemplate Template;



    @Override
    public Oneview getOneview(){
        String customerID = "123456";//TODO: take from records

        String url = GET_ONEVIEW+customerID+"/billpay/oneview";
        HttpHeaders headers = headerGene.headergenrator("","GET", url);
        HttpEntity<Oneview> entity = new HttpEntity<>(headers);

        //TODO: MAP Accordding to JSON
        ResponseEntity<Oneview> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.GET, entity, Oneview.class);
        //System.out.println(response.getBody());
        return response.getBody();

    }
}
