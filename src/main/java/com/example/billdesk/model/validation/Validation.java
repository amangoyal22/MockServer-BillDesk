
package com.example.billdesk.model.validation;

import com.example.billdesk.model.bill.Authenticator;
import com.example.billdesk.model.bill.Bill;

import java.io.Serializable;
import java.util.List;

public class Validation implements Serializable
{

    private String objectid;
    private String sourceid;
    private String customerid;
    private String validationid;
    private String validationDate;
    private String validUntil;
    private String billeraccountid;
    private String billerid;
    private String payMultipleBills;
    private List<Authenticator> authenticators = null;
    private List<AdditionalValidationDetail> additionalValidationDetails = null;
    private List<Bill> billlist = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Validation() {
    }

    /**
     * 
     * @param bill
     * @param billerid
     * @param validationid
     * @param customerid
     * @param authenticators
     * @param sourceid
     * @param additionalValidationDetails
     * @param billeraccountid
     * @param validUntil
     * @param validationDate
     * @param objectid
     * @param payMultipleBills
     */
    public Validation(String objectid, String sourceid, String customerid, String validationid, String validationDate, String validUntil, String billeraccountid, String billerid, List<Authenticator> authenticators, String payMultipleBills, List<AdditionalValidationDetail> additionalValidationDetails, List<Bill> bill) {
        super();
        this.objectid = objectid;
        this.sourceid = sourceid;
        this.customerid = customerid;
        this.validationid = validationid;
        this.validationDate = validationDate;
        this.validUntil = validUntil;
        this.billeraccountid = billeraccountid;
        this.billerid = billerid;
        this.authenticators = authenticators;
        this.payMultipleBills = payMultipleBills;
        this.additionalValidationDetails = additionalValidationDetails;
        this.billlist = bill;
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

    public String getValidationid() {
        return validationid;
    }

    public void setValidationid(String validationid) {
        this.validationid = validationid;
    }

    public String getValidationDate() {
        return validationDate;
    }

    public void setValidationDate(String validationDate) {
        this.validationDate = validationDate;
    }

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public String getBilleraccountid() {
        return billeraccountid;
    }

    public void setBilleraccountid(String billeraccountid) {
        this.billeraccountid = billeraccountid;
    }

    public String getBillerid() {
        return billerid;
    }

    public void setBillerid(String billerid) {
        this.billerid = billerid;
    }

    public List<Authenticator> getAuthenticators() {
        return authenticators;
    }

    public void setAuthenticators(List<Authenticator> authenticators) {
        this.authenticators = authenticators;
    }

    public String getPayMultipleBills() {
        return payMultipleBills;
    }

    public void setPayMultipleBills(String payMultipleBills) {
        this.payMultipleBills = payMultipleBills;
    }

    public List<AdditionalValidationDetail> getAdditionalValidationDetails() {
        return additionalValidationDetails;
    }

    public void setAdditionalValidationDetails(List<AdditionalValidationDetail> additionalValidationDetails) {
        this.additionalValidationDetails = additionalValidationDetails;
    }

    public List<Bill> getBilllist() {
        return billlist;
    }

    public void setBilllist(List<Bill> billlist) {
        this.billlist = billlist;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("objectid", objectid).append("sourceid", sourceid).append("customerid", customerid).append("validationid", validationid).append("validationDate", validationDate).append("validUntil", validUntil).append("billeraccountid", billeraccountid).append("billerid", billerid).append("authenticators", authenticators).append("payMultipleBills", payMultipleBills).append("additionalValidationDetails", additionalValidationDetails).append("billlist", billlist).toString();
    }

}
