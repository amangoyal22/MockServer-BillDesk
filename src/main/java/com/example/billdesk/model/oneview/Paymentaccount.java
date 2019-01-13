
package com.example.billdesk.model.oneview;

import java.io.Serializable;
public class Paymentaccount implements Serializable
{

    private String paymentaccountid;
    private String shortName;
    private String paymentMethod;
    private String cardStart;
    private String cardEnd;
    private String cardholderName;
    /**
     * No args constructor for use in serialization
     * 
     */
    public Paymentaccount() {
    }

    /**
     * 
     * @param cardholderName
     * @param cardStart
     * @param paymentaccountid
     * @param shortName
     * @param paymentMethod
     * @param cardEnd
     */
    public Paymentaccount(String paymentaccountid, String shortName, String paymentMethod, String cardStart, String cardEnd, String cardholderName) {
        super();
        this.paymentaccountid = paymentaccountid;
        this.shortName = shortName;
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

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("paymentaccountid", paymentaccountid).append("shortName", shortName).append("paymentMethod", paymentMethod).append("cardStart", cardStart).append("cardEnd", cardEnd).append("cardholderName", cardholderName).toString();
    }

}
