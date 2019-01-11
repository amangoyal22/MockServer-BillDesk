
package com.example.billdesk.model.billeraccount;

import java.io.Serializable;

public class PaymentAccount implements Serializable
{


    private String paymentaccountid;
    private String objectid;
    private String shortName;
    private String paymentMethod;
    private String cardStart;
    private String cardEnd;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentAccount() {
    }

    /**
     * 
     * @param cardStart
     * @param paymentaccountid
     * @param shortName
     * @param objectid
     * @param paymentMethod
     * @param cardEnd
     */
    public PaymentAccount(String paymentaccountid, String objectid, String shortName, String paymentMethod, String cardStart, String cardEnd) {
        super();
        this.paymentaccountid = paymentaccountid;
        this.objectid = objectid;
        this.shortName = shortName;
        this.paymentMethod = paymentMethod;
        this.cardStart = cardStart;
        this.cardEnd = cardEnd;
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

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("paymentaccountid", paymentaccountid).append("objectid", objectid).append("shortName", shortName).append("paymentMethod", paymentMethod).append("cardStart", cardStart).append("cardEnd", cardEnd).toString();
    }

}
