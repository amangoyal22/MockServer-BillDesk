package com.example.billdesk.header;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashMap;


@Component
public class HeaderGene {


    private Header header;

    @Value("${billdesk.crpy_key}")
    private String key;//secret key


    public HttpHeaders headergenrator(String body,String method,String api){
        HttpHeaders headers = new HttpHeaders();

        System.out.println(body+" "+method+" "+api);
        //Declaring attribute
        String id = header.getBdTraceId();
        System.out.println("\n id: "+id);


        String timestamp = header.getBdTimestamp();
        System.out.println("\n time: "+timestamp);

        String sha = header.getSha256(body);
        System.out.println("\n sha: "+sha);

        String value = header.generateHmacString(method,api,id,timestamp,sha);
        System.out.println("\n value: "+value);

        String hmac = header.hmacSha256(key,value);
        System.out.println("\n hmac: "+hmac);
        //Setting Header
        headers.set("Authorization",hmac);
        headers.set("BD-Traceid", id);
        headers.set("BD-Timestamp",timestamp );
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);

        return headers;
    }
}
