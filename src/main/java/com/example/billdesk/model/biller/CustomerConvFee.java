
package com.example.billdesk.model.biller;

import java.io.Serializable;

public class CustomerConvFee implements Serializable
{


    private String couConvFee;
    private String couConvFeeType;
    private String minCouConvFee;
    private String maxCouConvFee;
    private String bouConvFee;
    private String bouConvFeeType;
    private String minBouConvFee;
    private String maxBouConvFee;
    private String paymentChannel;
    private String paymentMethod;
    private String amountSlabStart;
    private String amountSlabEnd;
    private final static long serialVersionUID = 6383469575639200455L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomerConvFee() {
    }

    /**
     * 
     * @param couConvFeeType
     * @param minCouConvFee
     * @param amountSlabStart
     * @param paymentChannel
     * @param bouConvFee
     * @param maxCouConvFee
     * @param minBouConvFee
     * @param maxBouConvFee
     * @param couConvFee
     * @param bouConvFeeType
     * @param amountSlabEnd
     * @param paymentMethod
     */
    public CustomerConvFee(String couConvFee, String couConvFeeType, String minCouConvFee, String maxCouConvFee, String bouConvFee, String bouConvFeeType, String minBouConvFee, String maxBouConvFee, String paymentChannel, String paymentMethod, String amountSlabStart, String amountSlabEnd) {
        super();
        this.couConvFee = couConvFee;
        this.couConvFeeType = couConvFeeType;
        this.minCouConvFee = minCouConvFee;
        this.maxCouConvFee = maxCouConvFee;
        this.bouConvFee = bouConvFee;
        this.bouConvFeeType = bouConvFeeType;
        this.minBouConvFee = minBouConvFee;
        this.maxBouConvFee = maxBouConvFee;
        this.paymentChannel = paymentChannel;
        this.paymentMethod = paymentMethod;
        this.amountSlabStart = amountSlabStart;
        this.amountSlabEnd = amountSlabEnd;
    }

    public String getCouConvFee() {
        return couConvFee;
    }

    public void setCouConvFee(String couConvFee) {
        this.couConvFee = couConvFee;
    }

    public String getCouConvFeeType() {
        return couConvFeeType;
    }

    public void setCouConvFeeType(String couConvFeeType) {
        this.couConvFeeType = couConvFeeType;
    }

    public String getMinCouConvFee() {
        return minCouConvFee;
    }

    public void setMinCouConvFee(String minCouConvFee) {
        this.minCouConvFee = minCouConvFee;
    }

    public String getMaxCouConvFee() {
        return maxCouConvFee;
    }

    public void setMaxCouConvFee(String maxCouConvFee) {
        this.maxCouConvFee = maxCouConvFee;
    }

    public String getBouConvFee() {
        return bouConvFee;
    }

    public void setBouConvFee(String bouConvFee) {
        this.bouConvFee = bouConvFee;
    }

    public String getBouConvFeeType() {
        return bouConvFeeType;
    }

    public void setBouConvFeeType(String bouConvFeeType) {
        this.bouConvFeeType = bouConvFeeType;
    }

    public String getMinBouConvFee() {
        return minBouConvFee;
    }

    public void setMinBouConvFee(String minBouConvFee) {
        this.minBouConvFee = minBouConvFee;
    }

    public String getMaxBouConvFee() {
        return maxBouConvFee;
    }

    public void setMaxBouConvFee(String maxBouConvFee) {
        this.maxBouConvFee = maxBouConvFee;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getAmountSlabStart() {
        return amountSlabStart;
    }

    public void setAmountSlabStart(String amountSlabStart) {
        this.amountSlabStart = amountSlabStart;
    }

    public String getAmountSlabEnd() {
        return amountSlabEnd;
    }

    public void setAmountSlabEnd(String amountSlabEnd) {
        this.amountSlabEnd = amountSlabEnd;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("couConvFee", couConvFee).append("couConvFeeType", couConvFeeType).append("minCouConvFee", minCouConvFee).append("maxCouConvFee", maxCouConvFee).append("bouConvFee", bouConvFee).append("bouConvFeeType", bouConvFeeType).append("minBouConvFee", minBouConvFee).append("maxBouConvFee", maxBouConvFee).append("paymentChannel", paymentChannel).append("paymentMethod", paymentMethod).append("amountSlabStart", amountSlabStart).append("amountSlabEnd", amountSlabEnd).toString();
    }

}
