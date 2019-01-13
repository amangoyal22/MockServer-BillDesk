
package com.example.billdesk.model.bill;

import java.io.Serializable;
import java.util.List;

public class Bill implements Serializable
{


    private String billid;
    private String objectid;
    private String sourceid;
    private String billerid;
    private String billeraccountid;
    private List<Authenticator> authenticators = null;
    private String customerName;
    private String billnumber;
    private String billdate;
    private String billduedate;
    private String billamount;
    private String earlyBillduedate;
    private String earlyBilldiscount;
    private String earlyBillamount;
    private String billperiod;
    private String latePaymentCharges;
    private String latePaymentAmount;
    private String netBillamount;
    private String currency;
    private String description;
    private List<AdditionalDetail> additionalDetails = null;
    private List<LineItem> lineItems = null;
    private String billstatus;
    private final static long serialVersionUID = -5623479046845790224L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Bill() {
    }

    /**
     * 
     * @param customerName
     * @param billerid
     * @param authenticators
     * @param billeraccountid
     * @param billid
     * @param currency
     * @param latePaymentCharges
     * @param billnumber
     * @param billamount
     * @param billdate
     * @param description
     * @param netBillamount
     * @param sourceid
     * @param additionalDetails
     * @param billstatus
     * @param latePaymentAmount
     * @param earlyBilldiscount
     * @param objectid
     * @param lineItems
     * @param earlyBillduedate
     * @param earlyBillamount
     * @param billduedate
     */
    public Bill(String billid, String objectid, String sourceid, String billerid, String billeraccountid, List<Authenticator> authenticators, String customerName, String billnumber, String billdate, String billduedate, String billamount, String earlyBillduedate, String earlyBilldiscount, String earlyBillamount, String latePaymentCharges, String latePaymentAmount, String netBillamount, String currency, String description, List<AdditionalDetail> additionalDetails, List<LineItem> lineItems, String billstatus) {
        super();
        this.billid = billid;
        this.objectid = objectid;
        this.sourceid = sourceid;
        this.billerid = billerid;
        this.billeraccountid = billeraccountid;
        this.authenticators = authenticators;
        this.customerName = customerName;
        this.billnumber = billnumber;
        this.billdate = billdate;
        this.billduedate = billduedate;
        this.billamount = billamount;
        this.earlyBillduedate = earlyBillduedate;
        this.earlyBilldiscount = earlyBilldiscount;
        this.earlyBillamount = earlyBillamount;
        this.latePaymentCharges = latePaymentCharges;
        this.latePaymentAmount = latePaymentAmount;
        this.netBillamount = netBillamount;
        this.currency = currency;
        this.description = description;
        this.additionalDetails = additionalDetails;
        this.lineItems = lineItems;
        this.billstatus = billstatus;
    }
    public Bill(String billid, String objectid, String billnumber, String billperiod, String billdate, String billduedate, String billamount, String earlyBillduedate, String earlyBilldiscount, String earlyBillamount, String latePaymentCharges, String latePaymentAmount, String netBillamount, String description, List<AdditionalDetail> additionalDetails, List<LineItem> lineItems, String billstatus) {
        super();
        this.billid = billid;
        this.objectid = objectid;
        this.billnumber = billnumber;
        this.billperiod = billperiod;
        this.billdate = billdate;
        this.billduedate = billduedate;
        this.billamount = billamount;
        this.earlyBillduedate = earlyBillduedate;
        this.earlyBilldiscount = earlyBilldiscount;
        this.earlyBillamount = earlyBillamount;
        this.latePaymentCharges = latePaymentCharges;
        this.latePaymentAmount = latePaymentAmount;
        this.netBillamount = netBillamount;
        this.description = description;
        this.additionalDetails = additionalDetails;
        this.lineItems = lineItems;
        this.billstatus = billstatus;
    }

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
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

    public String getBillerid() {
        return billerid;
    }

    public void setBillerid(String billerid) {
        this.billerid = billerid;
    }

    public String getBilleraccountid() {
        return billeraccountid;
    }

    public void setBilleraccountid(String billeraccountid) {
        this.billeraccountid = billeraccountid;
    }

    public List<Authenticator> getAuthenticators() {
        return authenticators;
    }

    public void setAuthenticators(List<Authenticator> authenticators) {
        this.authenticators = authenticators;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBillnumber() {
        return billnumber;
    }

    public void setBillnumber(String billnumber) {
        this.billnumber = billnumber;
    }

    public String getBilldate() {
        return billdate;
    }

    public void setBilldate(String billdate) {
        this.billdate = billdate;
    }

    public String getBillduedate() {
        return billduedate;
    }

    public void setBillduedate(String billduedate) {
        this.billduedate = billduedate;
    }

    public String getBillamount() {
        return billamount;
    }

    public void setBillamount(String billamount) {
        this.billamount = billamount;
    }

    public String getEarlyBillduedate() {
        return earlyBillduedate;
    }

    public void setEarlyBillduedate(String earlyBillduedate) {
        this.earlyBillduedate = earlyBillduedate;
    }

    public String getEarlyBilldiscount() {
        return earlyBilldiscount;
    }

    public void setEarlyBilldiscount(String earlyBilldiscount) {
        this.earlyBilldiscount = earlyBilldiscount;
    }

    public String getEarlyBillamount() {
        return earlyBillamount;
    }

    public void setEarlyBillamount(String earlyBillamount) {
        this.earlyBillamount = earlyBillamount;
    }

    public String getLatePaymentCharges() {
        return latePaymentCharges;
    }

    public void setLatePaymentCharges(String latePaymentCharges) {
        this.latePaymentCharges = latePaymentCharges;
    }

    public String getLatePaymentAmount() {
        return latePaymentAmount;
    }

    public void setLatePaymentAmount(String latePaymentAmount) {
        this.latePaymentAmount = latePaymentAmount;
    }

    public String getNetBillamount() {
        return netBillamount;
    }

    public void setNetBillamount(String netBillamount) {
        this.netBillamount = netBillamount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AdditionalDetail> getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(List<AdditionalDetail> additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public String getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(String billstatus) {
        this.billstatus = billstatus;
    }

    @Override
    public String toString() {
        return "";// new ToStringBuilder(this).append("billid", billid).append("objectid", objectid).append("sourceid", sourceid).append("billerid", billerid).append("billeraccountid", billeraccountid).append("authenticators", authenticators).append("customerName", customerName).append("billnumber", billnumber).append("billdate", billdate).append("billduedate", billduedate).append("billamount", billamount).append("earlyBillduedate", earlyBillduedate).append("earlyBilldiscount", earlyBilldiscount).append("earlyBillamount", earlyBillamount).append("latePaymentCharges", latePaymentCharges).append("latePaymentAmount", latePaymentAmount).append("netBillamount", netBillamount).append("currency", currency).append("description", description).append("additionalDetails", additionalDetails).append("lineItems", lineItems).append("billstatus", billstatus).toString();
    }

}
