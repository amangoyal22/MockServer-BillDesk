package com.example.billdesk.service;

import com.example.billdesk.header.HeaderGene;
import com.example.billdesk.model.bill.Bill;
import com.example.billdesk.model.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentImp implements PaymentService {

    @Value("${mock.base_url}")
    private String baseurl;

    @Value("${billdesk.make_payment_p1}")
    private String MK_PYMENT_P1;
    @Value("${billdesk.make_payment_p2}")
    private String MK_PYMENT_P2;


    @Autowired
    private HeaderGene headerGene;
    @Autowired
    private RestTemplate Template;


    @Override
    public Payment makePayment(Payment payment){
        String customerID = "123456";//TODO: take from records
        String url = MK_PYMENT_P1+customerID+MK_PYMENT_P2;
        HttpHeaders headers = headerGene.headergenrator(payment.toString(),"POST", url);
        HttpEntity<Payment> entity = new HttpEntity<>(payment,headers);
        //TODO: MAP Accordding to JSON
        ResponseEntity<Payment> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.POST, entity, Payment.class);
        //System.out.println(response.getBody());
        return response.getBody();
    }
    @Override
    public Payment authPayment(Payment payment){
        //TODO: OTP is sended here
        String customerID = "123456";//TODO: take from records
        String paymentID = "ABCTXN34232";//TODO: take from records
        String url = MK_PYMENT_P1+customerID+MK_PYMENT_P2+"/"+paymentID+"/authorize";
        HttpHeaders headers = headerGene.headergenrator(payment.toString(),"PUT", url);
        HttpEntity<Payment> entity = new HttpEntity<>(payment,headers);
        System.out.println(baseurl+url);
        //TODO: MAP Accordding to JSON
        ResponseEntity<Payment> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.PUT, entity, Payment.class);
        //System.out.println(response.getBody());
        return response.getBody();
    }

    @Override
    public Payment retrievePayment(){
        //TODO: OTP is sended here
        String customerID = "123456";//TODO: take from records
        String paymentID = "ABCTXN34232";//TODO: take from records
        String url = MK_PYMENT_P1+customerID+MK_PYMENT_P2+"/"+paymentID;
        HttpHeaders headers = headerGene.headergenrator("","GET", url);
        HttpEntity<Payment> entity = new HttpEntity<>(headers);
        //TODO: MAP Accordding to JSON
        ResponseEntity<Payment> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.GET, entity, Payment.class);
        //System.out.println(response.getBody());
        return response.getBody();
    }

    @Override
    public Payment listPayment(){
        String customerID = "123456";//TODO: take from records
        String url = MK_PYMENT_P1+customerID+MK_PYMENT_P2;
        HttpHeaders headers = headerGene.headergenrator("","GET", url);
        HttpEntity<Payment> entity = new HttpEntity<>(headers);
        //TODO: MAP Accordding to JSON
        ResponseEntity<Payment> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.GET, entity, Payment.class);
        //System.out.println(response.getBody());
        return response.getBody();
    }

    @Override
    public Payment modifyPayment(Payment payment){
        String customerID = "123456";//TODO: take from records
        String paymentID = "ABCTXN34232";//TODO: take from records
        String url = MK_PYMENT_P1+customerID+MK_PYMENT_P2+"/"+paymentID;
        HttpHeaders headers = headerGene.headergenrator(payment.toString(),"PUT", url);
        HttpEntity<Payment> entity = new HttpEntity<>(payment,headers);
        //TODO: MAP Accordding to JSON
        ResponseEntity<Payment> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.PUT, entity, Payment.class);
        //System.out.println(response.getBody());
        return response.getBody();
    }

    @Override
    public Payment stopPayment(){
        String customerID = "123456";//TODO: take from records
        String paymentID = "ABCTXN34232";//TODO: take from records
        String url = MK_PYMENT_P1+customerID+MK_PYMENT_P2+"/"+paymentID;
        HttpHeaders headers = headerGene.headergenrator("","DELETE", url);
        HttpEntity<Payment> entity = new HttpEntity<>(headers);
        //TODO: MAP Accordding to JSON
        ResponseEntity<Payment> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.DELETE, entity, Payment.class);
        //System.out.println(response.getBody());
        return response.getBody();
    }

    @Override
    public Payment rOtpPayment(){
        String customerID = "123456";//TODO: take from records
        String paymentID = "ABCTXN34232";//TODO: take from records
        String url = MK_PYMENT_P1+customerID+MK_PYMENT_P2+"/"+paymentID+"/resendotp";
        HttpHeaders headers = headerGene.headergenrator("","DELETE", url);
        HttpEntity<Payment> entity = new HttpEntity<>(headers);
        //TODO: MAP Accordding to JSON
        ResponseEntity<Payment> response = Template.exchange(baseurl+url,//TODO: change to original api
                HttpMethod.DELETE, entity, Payment.class);
        //System.out.println(response.getBody());
        return response.getBody();
    }






}
