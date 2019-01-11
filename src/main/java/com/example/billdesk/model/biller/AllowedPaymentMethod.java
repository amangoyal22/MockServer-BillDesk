
package com.example.billdesk.model.biller;

import java.io.Serializable;

public class AllowedPaymentMethod implements Serializable
{


    private String paymentMethod;
    private String paymentMethodCategory;
    private String minLimit;
    private String maxImit;
    private String autopayAllowed;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AllowedPaymentMethod() {
    }

    /**
     * 
     * @param autopayAllowed
     * @param paymentMethodCategory
     * @param minLimit
     * @param paymentMethod
     * @param maxImit
     */
    public AllowedPaymentMethod(String paymentMethod, String paymentMethodCategory, String minLimit, String maxImit, String autopayAllowed) {
        super();
        this.paymentMethod = paymentMethod;
        this.paymentMethodCategory = paymentMethodCategory;
        this.minLimit = minLimit;
        this.maxImit = maxImit;
        this.autopayAllowed = autopayAllowed;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethodCategory() {
        return paymentMethodCategory;
    }

    public void setPaymentMethodCategory(String paymentMethodCategory) {
        this.paymentMethodCategory = paymentMethodCategory;
    }

    public String getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(String minLimit) {
        this.minLimit = minLimit;
    }

    public String getMaxImit() {
        return maxImit;
    }

    public void setMaxImit(String maxImit) {
        this.maxImit = maxImit;
    }

    public String getAutopayAllowed() {
        return autopayAllowed;
    }

    public void setAutopayAllowed(String autopayAllowed) {
        this.autopayAllowed = autopayAllowed;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("paymentMethod", paymentMethod).append("paymentMethodCategory", paymentMethodCategory).append("minLimit", minLimit).append("maxImit", maxImit).append("autopayAllowed", autopayAllowed).toString();
    }

}
