package com.example.billdesk.service;

import com.example.billdesk.header.HeaderGene;
import com.example.billdesk.model.billeraccount.BillerAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BillerAccoutImp implements BillerAccountService {


    @Value("${mock.base_url}")
    private String baseurl;

    @Value("${billdesk.add_biller_account_p1}")
    private String CREATE_BILLER_ACCOUNT_P1;
    @Value("${billdesk.add_biller_account_p2}")
    private String CREATE_BILLER_ACCOUNT_P2;

    @Value("${billdesk.activate_biller_account_p1}")
    private String ACTIVATE_BILLER_ACCOUNT_P1;
    @Value("${billdesk.activate_biller_account_p2}")
    private String ACTIVATE_BILLER_ACCOUNT_P2;


    @Autowired
    private HeaderGene headerGene;
    @Autowired
    private RestTemplate Template;

    @Override
    public BillerAccount add_billerAccount(BillerAccount billerAccount){
        String activationType = "rules";//or onhold
        String customerID = "123456";
        String url = CREATE_BILLER_ACCOUNT_P1+customerID+CREATE_BILLER_ACCOUNT_P2+activationType;
        HttpHeaders headers = headerGene.headergenrator("","POST", url);

        HttpEntity<BillerAccount> entity = new HttpEntity<>(billerAccount,headers);

        System.out.println(entity.toString()+"\n" +baseurl+url);

        //TODO: MAP Accordding to JSON
        ResponseEntity<BillerAccount> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.POST, entity, BillerAccount.class);
        //System.out.println(response.getBody());

        return response.getBody();
        //9845782930
    }
    @Override
    public BillerAccount activate_billerAccount(BillerAccount billerAccount){
        String customerID = "123456";
        String BillerAccountID = "";//TODO: take from records
        String url = ACTIVATE_BILLER_ACCOUNT_P1+customerID+ACTIVATE_BILLER_ACCOUNT_P2+BillerAccountID+"/activate";

        HttpHeaders headers = headerGene.headergenrator("","POST", url);

        HttpEntity<BillerAccount> entity = new HttpEntity<>(billerAccount,headers);

       // System.out.println(entity.toString()+"\n" +baseurl+url);

        //TODO: MAP Accordding to JSON
        ResponseEntity<BillerAccount> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.POST, entity, BillerAccount.class);
        //System.out.println(response.getBody());

        return response.getBody();
        //9845782930
    }
}
