
package com.example.billdesk.model.billeraccount;

import java.io.Serializable;
import java.util.List;

public class BillerAccount implements Serializable
{

    private String billeraccountid;
    private String objectid;
    private String sourceid;
    private String customerid;
    private String billerid;
    private String shortName;
    private List<Authenticator> authenticators = null;
    private String status;
    private String registrationDate;
    private String modifiedDate;
    private String autopayStatus;
    private String autopayStartDate;
    private String autopayEndDate;
    private String autopayAmount;
    private String currency;
    private String frequency;
    private PaymentAccount paymentAccount;
    private Customer customer;
    private Metadata metadata;
    /**
     * No args constructor for use in serialization
     * 
     */
    public BillerAccount() {
    }

    /**
     * 
     * @param paymentAccount
     * @param autopayStatus
     * @param billerid
     * @param status
     * @param authenticators
     * @param billeraccountid
     * @param frequency
     * @param customer
     * @param autopayEndDate
     * @param modifiedDate
     * @param currency
     * @param registrationDate
     * @param customerid
     * @param autopayAmount
     * @param sourceid
     * @param objectid
     * @param shortName
     * @param autopayStartDate
     * @param metadata
     */
    public BillerAccount(String billeraccountid, String objectid, String sourceid, String customerid, String billerid, String shortName, List<Authenticator> authenticators, String status, String registrationDate, String modifiedDate, String autopayStatus, String autopayStartDate, String autopayEndDate, String autopayAmount, String currency, String frequency, PaymentAccount paymentAccount, Customer customer, Metadata metadata) {
        super();
        this.billeraccountid = billeraccountid;
        this.objectid = objectid;
        this.sourceid = sourceid;
        this.customerid = customerid;
        this.billerid = billerid;
        this.shortName = shortName;
        this.authenticators = authenticators;
        this.status = status;
        this.registrationDate = registrationDate;
        this.modifiedDate = modifiedDate;
        this.autopayStatus = autopayStatus;
        this.autopayStartDate = autopayStartDate;
        this.autopayEndDate = autopayEndDate;
        this.autopayAmount = autopayAmount;
        this.currency = currency;
        this.frequency = frequency;
        this.paymentAccount = paymentAccount;
        this.customer = customer;
        this.metadata = metadata;
    }

    public String getBilleraccountid() {
        return billeraccountid;
    }

    public void setBilleraccountid(String billeraccountid) {
        this.billeraccountid = billeraccountid;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    public String getSourceid() {
        return sourceid;
    }

    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getBillerid() {
        return billerid;
    }

    public void setBillerid(String billerid) {
        this.billerid = billerid;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public List<Authenticator> getAuthenticators() {
        return authenticators;
    }

    public void setAuthenticators(List<Authenticator> authenticators) {
        this.authenticators = authenticators;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getAutopayStatus() {
        return autopayStatus;
    }

    public void setAutopayStatus(String autopayStatus) {
        this.autopayStatus = autopayStatus;
    }

    public String getAutopayStartDate() {
        return autopayStartDate;
    }

    public void setAutopayStartDate(String autopayStartDate) {
        this.autopayStartDate = autopayStartDate;
    }

    public String getAutopayEndDate() {
        return autopayEndDate;
    }

    public void setAutopayEndDate(String autopayEndDate) {
        this.autopayEndDate = autopayEndDate;
    }

    public String getAutopayAmount() {
        return autopayAmount;
    }

    public void setAutopayAmount(String autopayAmount) {
        this.autopayAmount = autopayAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("billeraccountid", billeraccountid).append("objectid", objectid).append("sourceid", sourceid).append("customerid", customerid).append("billerid", billerid).append("shortName", shortName).append("authenticators", authenticators).append("status", status).append("registrationDate", registrationDate).append("modifiedDate", modifiedDate).append("autopayStatus", autopayStatus).append("autopayStartDate", autopayStartDate).append("autopayEndDate", autopayEndDate).append("autopayAmount", autopayAmount).append("currency", currency).append("frequency", frequency).append("paymentAccount", paymentAccount).append("customer", customer).append("metadata", metadata).toString();
    }

}
