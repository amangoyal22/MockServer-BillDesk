
package com.example.billdesk.model.payment;

import java.io.Serializable;
import java.util.List;

import com.example.billdesk.model.bill.AdditionalDetail;
import com.example.billdesk.model.bill.LineItem;

public class Billlist implements Serializable
{

    private String objectid;
    private String billid;
    private String billnumber;
    private String billdate;
    private String billduedate;
    private String billamount;
    private String earlyBillduedate;
    private String earlyBilldiscount;
    private String earlyBillamount;
    private String latePaymentCharges;
    private String latePaymentAmount;
    private String netBillamount;
    private String currency;
    private String description;
    private List<AdditionalDetail> additionalDetails = null;
    private List<LineItem> lineItems = null;
    /**
     * No args constructor for use in serialization
     * 
     */
    public Billlist() {
    }

    /**
     * 
     * @param billid
     * @param currency
     * @param billnumber
     * @param latePaymentCharges
     * @param billamount
     * @param billdate
     * @param description
     * @param netBillamount
     * @param additionalDetails
     * @param objectid
     * @param earlyBilldiscount
     * @param latePaymentAmount
     * @param lineItems
     * @param earlyBillduedate
     * @param billduedate
     * @param earlyBillamount
     */
    public Billlist(String objectid, String billid, String billnumber, String billdate, String billduedate, String billamount, String earlyBillduedate, String earlyBilldiscount, String earlyBillamount, String latePaymentCharges, String latePaymentAmount, String netBillamount, String currency, String description, List<AdditionalDetail> additionalDetails, List<LineItem> lineItems) {
        super();
        this.objectid = objectid;
        this.billid = billid;
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
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
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

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("objectid", objectid).append("billid", billid).append("billnumber", billnumber).append("billdate", billdate).append("billduedate", billduedate).append("billamount", billamount).append("earlyBillduedate", earlyBillduedate).append("earlyBilldiscount", earlyBilldiscount).append("earlyBillamount", earlyBillamount).append("latePaymentCharges", latePaymentCharges).append("latePaymentAmount", latePaymentAmount).append("netBillamount", netBillamount).append("currency", currency).append("description", description).append("additionalDetails", additionalDetails).append("lineItems", lineItems).toString();
    }

}
