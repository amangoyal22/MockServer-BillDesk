
package com.example.billdesk.model.biller;

import java.io.Serializable;

public class PaymentChannel implements Serializable
{

    private String paymentChannel;
    private String minLimit;
    private String maxLimit;
    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentChannel() {
    }

    /**
     * 
     * @param paymentChannel
     * @param maxLimit
     * @param minLimit
     */
    public PaymentChannel(String paymentChannel, String minLimit, String maxLimit) {
        super();
        this.paymentChannel = paymentChannel;
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(String minLimit) {
        this.minLimit = minLimit;
    }

    public String getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(String maxLimit) {
        this.maxLimit = maxLimit;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("paymentChannel", paymentChannel).append("minLimit", minLimit).append("maxLimit", maxLimit).toString();
    }

}
