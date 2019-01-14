
package com.example.billdesk.model.payment;

import com.example.billdesk.model.billeraccount.Authenticator;

import java.io.Serializable;
import java.util.List;

public class Payment implements Serializable
{
    private String paymentid;
    private String sourceid;
    private String objectid;
    private String billerid;
    private String billerName;
    private String billerCategory;
    private String billeraccountid;
    private String shortName;
    private List<Authenticator> authenticators = null;
    private String validationid;
    private String customerAlertMsg;
    private List<Billlist> billlist = null;
    private String currency;
    private String paymentAmount;
    private String couConvFee;
    private String bouConvFee;
    private String debitAmount;
    private String paymentType;
    private String paymentRemarks;
    private String sourceRefNo;
    private String bbpsRefNo;
    private String txnDateTime;
    private String paymentStatus;
    private String nextStep;
    private String billerApprovalCode;
    private String billerStatus;
    private String billerStatusDesc;
    private PaymentAccount paymentAccount;
    private String authCode;
    private List<Link> links = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payment() {
    }

    /**
     * 
     * @param authCode
     * @param billerStatusDesc
     * @param billlist
     * @param billerid
     * @param validationid
     * @param bouConvFee
     * @param billeraccountid
     * @param billerName
     * @param currency
     * @param paymentAmount
     * @param debitAmount
     * @param txnDateTime
     * @param couConvFee
     * @param customerAlertMsg
     * @param paymentRemarks
     * @param paymentAccount
     * @param billerStatus
     * @param paymentType
     * @param authenticators
     * @param paymentid
     * @param links
     * @param bbpsRefNo
     * @param paymentStatus
     * @param billerApprovalCode
     * @param sourceid
     * @param sourceRefNo
     * @param billerCategory
     * @param shortName
     * @param objectid
     * @param nextStep
     */
    public Payment(String paymentid, String sourceid, String objectid, String billerid, String billerName, String billerCategory, String billeraccountid, String shortName, List<Authenticator> authenticators, String validationid, String customerAlertMsg, List<Billlist> billlist, String currency, String paymentAmount, String couConvFee, String bouConvFee, String debitAmount, String paymentType, String paymentRemarks, String sourceRefNo, String bbpsRefNo, String txnDateTime, String paymentStatus, String nextStep, String billerApprovalCode, String billerStatus, String billerStatusDesc, PaymentAccount paymentAccount, String authCode, List<Link> links) {
        super();
        this.paymentid = paymentid;
        this.sourceid = sourceid;
        this.objectid = objectid;
        this.billerid = billerid;
        this.billerName = billerName;
        this.billerCategory = billerCategory;
        this.billeraccountid = billeraccountid;
        this.shortName = shortName;
        this.authenticators = authenticators;
        this.validationid = validationid;
        this.customerAlertMsg = customerAlertMsg;
        this.billlist = billlist;
        this.currency = currency;
        this.paymentAmount = paymentAmount;
        this.couConvFee = couConvFee;
        this.bouConvFee = bouConvFee;
        this.debitAmount = debitAmount;
        this.paymentType = paymentType;
        this.paymentRemarks = paymentRemarks;
        this.sourceRefNo = sourceRefNo;
        this.bbpsRefNo = bbpsRefNo;
        this.txnDateTime = txnDateTime;
        this.paymentStatus = paymentStatus;
        this.nextStep = nextStep;
        this.billerApprovalCode = billerApprovalCode;
        this.billerStatus = billerStatus;
        this.billerStatusDesc = billerStatusDesc;
        this.paymentAccount = paymentAccount;
        this.authCode = authCode;
        this.links = links;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getSourceid() {
        return sourceid;
    }

    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    public String getBillerid() {
        return billerid;
    }

    public void setBillerid(String billerid) {
        this.billerid = billerid;
    }

    public String getBillerName() {
        return billerName;
    }

    public void setBillerName(String billerName) {
        this.billerName = billerName;
    }

    public String getBillerCategory() {
        return billerCategory;
    }

    public void setBillerCategory(String billerCategory) {
        this.billerCategory = billerCategory;
    }

    public String getBilleraccountid() {
        return billeraccountid;
    }

    public void setBilleraccountid(String billeraccountid) {
        this.billeraccountid = billeraccountid;
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

    public String getValidationid() {
        return validationid;
    }

    public void setValidationid(String validationid) {
        this.validationid = validationid;
    }

    public String getCustomerAlertMsg() {
        return customerAlertMsg;
    }

    public void setCustomerAlertMsg(String customerAlertMsg) {
        this.customerAlertMsg = customerAlertMsg;
    }

    public List<Billlist> getBilllist() {
        return billlist;
    }

    public void setBilllist(List<Billlist> billlist) {
        this.billlist = billlist;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getCouConvFee() {
        return couConvFee;
    }

    public void setCouConvFee(String couConvFee) {
        this.couConvFee = couConvFee;
    }

    public String getBouConvFee() {
        return bouConvFee;
    }

    public void setBouConvFee(String bouConvFee) {
        this.bouConvFee = bouConvFee;
    }

    public String getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentRemarks() {
        return paymentRemarks;
    }

    public void setPaymentRemarks(String paymentRemarks) {
        this.paymentRemarks = paymentRemarks;
    }

    public String getSourceRefNo() {
        return sourceRefNo;
    }

    public void setSourceRefNo(String sourceRefNo) {
        this.sourceRefNo = sourceRefNo;
    }

    public String getBbpsRefNo() {
        return bbpsRefNo;
    }

    public void setBbpsRefNo(String bbpsRefNo) {
        this.bbpsRefNo = bbpsRefNo;
    }

    public String getTxnDateTime() {
        return txnDateTime;
    }

    public void setTxnDateTime(String txnDateTime) {
        this.txnDateTime = txnDateTime;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getNextStep() {
        return nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

    public String getBillerApprovalCode() {
        return billerApprovalCode;
    }

    public void setBillerApprovalCode(String billerApprovalCode) {
        this.billerApprovalCode = billerApprovalCode;
    }

    public String getBillerStatus() {
        return billerStatus;
    }

    public void setBillerStatus(String billerStatus) {
        this.billerStatus = billerStatus;
    }

    public String getBillerStatusDesc() {
        return billerStatusDesc;
    }

    public void setBillerStatusDesc(String billerStatusDesc) {
        this.billerStatusDesc = billerStatusDesc;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("paymentid", paymentid).append("sourceid", sourceid).append("objectid", objectid).append("billerid", billerid).append("billerName", billerName).append("billerCategory", billerCategory).append("billeraccountid", billeraccountid).append("shortName", shortName).append("authenticators", authenticators).append("validationid", validationid).append("customerAlertMsg", customerAlertMsg).append("billlist", billlist).append("currency", currency).append("paymentAmount", paymentAmount).append("couConvFee", couConvFee).append("bouConvFee", bouConvFee).append("debitAmount", debitAmount).append("paymentType", paymentType).append("paymentRemarks", paymentRemarks).append("sourceRefNo", sourceRefNo).append("bbpsRefNo", bbpsRefNo).append("txnDateTime", txnDateTime).append("paymentStatus", paymentStatus).append("nextStep", nextStep).append("billerApprovalCode", billerApprovalCode).append("billerStatus", billerStatus).append("billerStatusDesc", billerStatusDesc).append("paymentAccount", paymentAccount).append("authCode", authCode).append("links", links).toString();
    }

}
