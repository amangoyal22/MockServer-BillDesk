package com.example.billdesk.service;

import com.example.billdesk.header.HeaderGene;
import com.example.billdesk.model.customer.Customer;
import com.example.billdesk.model.health.Health;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerImp implements CustomerService {

    @Value("${mock.base_url}")
    private String baseurl;
    @Value("${billdesk.add_customer}")
    private String ADD_CUST;
    @Value("${billdesk.view_customer}")
    private String VIEW_CUST;
    @Value("${billdesk.modify_customer}")
    private String MODIFY_CUST;
    @Value("${billdesk.delete_customer}")
    private String DELETE_CUST;

    @Autowired
    private HeaderGene headerGene;
    @Autowired
    private RestTemplate Template;

    @Override
    public Customer addCustomer(Customer customer){
        //TODO: How to Send the customer body to SHA...Format(string what??)
        HttpHeaders headers = headerGene.headergenrator(customer.toString(),"POST", ADD_CUST);
        HttpEntity<Customer> entity = new HttpEntity<>(customer,headers);
        // Send request with GET method, and Headers.
        System.out.println(entity.toString()+"\n" +baseurl+ADD_CUST);


        ResponseEntity<Customer> response = Template.exchange(baseurl+ADD_CUST,//TODO: change to original api
                HttpMethod.POST, entity, Customer.class);

        return response.getBody();
    }
    @Override
    public Customer viewCustomer(){

        //TODO: Customer ID needed to be fetched
        String id = "12345";

        //TODO: How to Send the empty body to SHA
        HttpHeaders headers = headerGene.headergenrator("","GET", VIEW_CUST+id);
        HttpEntity<Customer> entity = new HttpEntity<>(headers);
        // Send request with POST method, and Headers.
        System.out.println(entity.toString()+"\n" +baseurl+VIEW_CUST+id);


        ResponseEntity<Customer> response = Template.exchange(baseurl+VIEW_CUST+id,//TODO: change to original api
                HttpMethod.GET, entity, Customer.class);

        return response.getBody();
    }

    @Override
    public Customer modifyCustomer(Customer customer){

        //TODO: Customer ID needed to be fetched
        String id = "6789";
        //TODO: How to Send the customer body to SHA...Format(string what??)
        HttpHeaders headers = headerGene.headergenrator(customer.toString(),"PUT", MODIFY_CUST+id);
        HttpEntity<Customer> entity = new HttpEntity<>(customer,headers);
        // Send request with PUT method, and Headers.
        System.out.println(entity.toString()+"\n" +baseurl+MODIFY_CUST+id);


        ResponseEntity<Customer> response = Template.exchange(baseurl+MODIFY_CUST+id,//TODO: change to original api
                HttpMethod.PUT, entity, Customer.class);

        return response.getBody();
    }

    @Override
    public Customer deleteCustomer(){

        //TODO: Customer ID needed to be fetched
        String id = "12345";

        //TODO: How to Send the empty body to SHA
        HttpHeaders headers = headerGene.headergenrator("","DELETE", DELETE_CUST+id);
        HttpEntity<Customer> entity = new HttpEntity<>(headers);
        // Send request with POST method, and Headers.
        System.out.println(entity.toString()+"\n" +baseurl+DELETE_CUST+id);


        ResponseEntity<Customer> response = Template.exchange(baseurl+DELETE_CUST+id,//TODO: change to original api
                HttpMethod.DELETE, entity, Customer.class);

        return response.getBody();
    }
}
