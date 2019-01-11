package com.example.billdesk.model.health;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Health implements Serializable
{

    private String objectid;
    private String status;

    public Health() {
    }

    /**
     *
     * @param status
     * @param objectid
     */
    public Health(String objectid, String status) {
        super();
        this.objectid = objectid;
        this.status = status;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}