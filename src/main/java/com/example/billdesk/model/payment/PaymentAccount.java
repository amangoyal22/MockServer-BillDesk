
package com.example.billdesk.model.payment;

import java.io.Serializable;

public class PaymentAccount implements Serializable
{

    private String paymentaccountid;
    private String objectid;
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
    public PaymentAccount() {
    }

    /**
     * 
     * @param cardholderName
     * @param cardStart
     * @param status
     * @param paymentaccountid
     * @param shortName
     * @param objectid
     * @param paymentMethod
     * @param cardEnd
     */
    public PaymentAccount(String paymentaccountid, String objectid, String shortName, String status, String paymentMethod, String cardStart, String cardEnd, String cardholderName) {
        super();
        this.paymentaccountid = paymentaccountid;
        this.objectid = objectid;
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

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("paymentaccountid", paymentaccountid).append("objectid", objectid).append("shortName", shortName).append("status", status).append("paymentMethod", paymentMethod).append("cardStart", cardStart).append("cardEnd", cardEnd).append("cardholderName", cardholderName).toString();
    }

}
