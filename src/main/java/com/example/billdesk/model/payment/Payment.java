
package com.example.billdesk.model.payment;

import org.springframework.stereotype.Component;

import java.io.Serializable;



@Component
public class Payment implements Serializable
{

    private String paymentaccountid;
    private String objectid;
    private String customerid;
    private String shortName;
    private String status;
    private String paymentMethod;
    private String cardStart;
    private String cardEnd;
    private String cardholderName;
   /**
     * No args constructor for use in serialization
     * 
     */
    public Payment() {
    }

    /**
     * 
     * @param cardholderName
     * @param cardStart
     * @param customerid
     * @param status
     * @param paymentaccountid
     * @param shortName
     * @param objectid
     * @param paymentMethod
     * @param cardEnd
     */
    public Payment(String paymentaccountid, String objectid, String customerid, String shortName, String status, String paymentMethod, String cardStart, String cardEnd, String cardholderName) {
        super();
        this.paymentaccountid = paymentaccountid;
        this.objectid = objectid;
        this.customerid = customerid;
        this.shortName = shortName;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.cardStart = cardStart;
        this.cardEnd = cardEnd;
        this.cardholderName = cardholderName;
    }

    public String getPaymentaccountid() {
        return paymentaccountid;
    }

    public void setPaymentaccountid(String paymentaccountid) {
        this.paymentaccountid = paymentaccountid;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCardStart() {
        return cardStart;
    }

    public void setCardStart(String cardStart) {
        this.cardStart = cardStart;
    }

    public String getCardEnd() {
        return cardEnd;
    }

    public void setCardEnd(String cardEnd) {
        this.cardEnd = cardEnd;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

}
