
package com.example.billdesk.model.biller;

import java.io.Serializable;
import java.util.List;

public class Biller implements Serializable
{


    private String billerid;

    private String objectid;

    private String sourceid;
    private String billerLegalName;
    private String billerName;
    private String billerLocation;
    private String billerLocationDesc;
    private String billerCategory;
    private String billerRegAddress;
    private String billerRegCity;
    private String billerRegPin;
    private String billerRegState;
    private String billerRegCountry;
    private String isbillerbbps;
    private String currency;
    private String billerType;
    private String billerMode;
    private List<AllowedPaymentMethod> allowedPaymentMethods = null;
    private List<PaymentChannel> paymentChannels = null;
    private String billerEffectiveFrom;
    private String billerEffectiveTo;
    private String billerStatus;
    private String tempDeactivationStart;
    private String tempDeactivationEnd;
    private String billerCreatedDate;
    private String billerLastmodifiedDate;
    private List<Authenticator> authenticators = null;
    private String billerLogo;
    private String billerBillCopy;
    private String partialPay;
    private String payAfterDuedate;
    private String onlineValidation;
    private List<CustomerConvFee> customerConvFee = null;
    private String paymentamountValidation;
    private List<AdditionalValidationDetail> additionalValidationDetails = null;
 /**
     * No args constructor for use in serialization
     * 
     */
    public Biller() {
    }

    /**
     * 
     * @param billerLogo
     * @param billerLocation
     * @param billerid
     * @param billerRegAddress
     * @param billerCreatedDate
     * @param billerLocationDesc
     * @param billerName
     * @param currency
     * @param tempDeactivationEnd
     * @param paymentamountValidation
     * @param billerLegalName
     * @param isbillerbbps
     * @param tempDeactivationStart
     * @param billerRegState
     * @param billerType
     * @param billerStatus
     * @param authenticators
     * @param allowedPaymentMethods
     * @param onlineValidation
     * @param billerRegCity
     * @param payAfterDuedate
     * @param customerConvFee
     * @param partialPay
     * @param paymentChannels
     * @param billerLastmodifiedDate
     * @param sourceid
     * @param billerEffectiveFrom
     * @param additionalValidationDetails
     * @param billerCategory
     * @param billerMode
     * @param objectid
     * @param billerRegCountry
     * @param billerEffectiveTo
     * @param billerBillCopy
     * @param billerRegPin
     */
    public Biller(String billerid, String objectid, String sourceid, String billerLegalName, String billerName, String billerLocation, String billerLocationDesc, String billerCategory, String billerRegAddress, String billerRegCity, String billerRegPin, String billerRegState, String billerRegCountry, String isbillerbbps, String currency, String billerType, String billerMode, List<AllowedPaymentMethod> allowedPaymentMethods, List<PaymentChannel> paymentChannels, String billerEffectiveFrom, String billerEffectiveTo, String billerStatus, String tempDeactivationStart, String tempDeactivationEnd, String billerCreatedDate, String billerLastmodifiedDate, List<Authenticator> authenticators, String billerLogo, String billerBillCopy, String partialPay, String payAfterDuedate, String onlineValidation, List<CustomerConvFee> customerConvFee, String paymentamountValidation, List<AdditionalValidationDetail> additionalValidationDetails) {
        super();
        this.billerid = billerid;
        this.objectid = objectid;
        this.sourceid = sourceid;
        this.billerLegalName = billerLegalName;
        this.billerName = billerName;
        this.billerLocation = billerLocation;
        this.billerLocationDesc = billerLocationDesc;
        this.billerCategory = billerCategory;
        this.billerRegAddress = billerRegAddress;
        this.billerRegCity = billerRegCity;
        this.billerRegPin = billerRegPin;
        this.billerRegState = billerRegState;
        this.billerRegCountry = billerRegCountry;
        this.isbillerbbps = isbillerbbps;
        this.currency = currency;
        this.billerType = billerType;
        this.billerMode = billerMode;
        this.allowedPaymentMethods = allowedPaymentMethods;
        this.paymentChannels = paymentChannels;
        this.billerEffectiveFrom = billerEffectiveFrom;
        this.billerEffectiveTo = billerEffectiveTo;
        this.billerStatus = billerStatus;
        this.tempDeactivationStart = tempDeactivationStart;
        this.tempDeactivationEnd = tempDeactivationEnd;
        this.billerCreatedDate = billerCreatedDate;
        this.billerLastmodifiedDate = billerLastmodifiedDate;
        this.authenticators = authenticators;
        this.billerLogo = billerLogo;
        this.billerBillCopy = billerBillCopy;
        this.partialPay = partialPay;
        this.payAfterDuedate = payAfterDuedate;
        this.onlineValidation = onlineValidation;
        this.customerConvFee = customerConvFee;
        this.paymentamountValidation = paymentamountValidation;
        this.additionalValidationDetails = additionalValidationDetails;
    }

    public String getBillerid() {
        return billerid;
    }

    public void setBillerid(String billerid) {
        this.billerid = billerid;
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

    public String getBillerLegalName() {
        return billerLegalName;
    }

    public void setBillerLegalName(String billerLegalName) {
        this.billerLegalName = billerLegalName;
    }

    public String getBillerName() {
        return billerName;
    }

    public void setBillerName(String billerName) {
        this.billerName = billerName;
    }

    public String getBillerLocation() {
        return billerLocation;
    }

    public void setBillerLocation(String billerLocation) {
        this.billerLocation = billerLocation;
    }

    public String getBillerLocationDesc() {
        return billerLocationDesc;
    }

    public void setBillerLocationDesc(String billerLocationDesc) {
        this.billerLocationDesc = billerLocationDesc;
    }

    public String getBillerCategory() {
        return billerCategory;
    }

    public void setBillerCategory(String billerCategory) {
        this.billerCategory = billerCategory;
    }

    public String getBillerRegAddress() {
        return billerRegAddress;
    }

    public void setBillerRegAddress(String billerRegAddress) {
        this.billerRegAddress = billerRegAddress;
    }

    public String getBillerRegCity() {
        return billerRegCity;
    }

    public void setBillerRegCity(String billerRegCity) {
        this.billerRegCity = billerRegCity;
    }

    public String getBillerRegPin() {
        return billerRegPin;
    }

    public void setBillerRegPin(String billerRegPin) {
        this.billerRegPin = billerRegPin;
    }

    public String getBillerRegState() {
        return billerRegState;
    }

    public void setBillerRegState(String billerRegState) {
        this.billerRegState = billerRegState;
    }

    public String getBillerRegCountry() {
        return billerRegCountry;
    }

    public void setBillerRegCountry(String billerRegCountry) {
        this.billerRegCountry = billerRegCountry;
    }

    public String getIsbillerbbps() {
        return isbillerbbps;
    }

    public void setIsbillerbbps(String isbillerbbps) {
        this.isbillerbbps = isbillerbbps;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBillerType() {
        return billerType;
    }

    public void setBillerType(String billerType) {
        this.billerType = billerType;
    }

    public String getBillerMode() {
        return billerMode;
    }

    public void setBillerMode(String billerMode) {
        this.billerMode = billerMode;
    }

    public List<AllowedPaymentMethod> getAllowedPaymentMethods() {
        return allowedPaymentMethods;
    }

    public void setAllowedPaymentMethods(List<AllowedPaymentMethod> allowedPaymentMethods) {
        this.allowedPaymentMethods = allowedPaymentMethods;
    }

    public List<PaymentChannel> getPaymentChannels() {
        return paymentChannels;
    }

    public void setPaymentChannels(List<PaymentChannel> paymentChannels) {
        this.paymentChannels = paymentChannels;
    }

    public String getBillerEffectiveFrom() {
        return billerEffectiveFrom;
    }

    public void setBillerEffectiveFrom(String billerEffectiveFrom) {
        this.billerEffectiveFrom = billerEffectiveFrom;
    }

    public String getBillerEffectiveTo() {
        return billerEffectiveTo;
    }

    public void setBillerEffectiveTo(String billerEffectiveTo) {
        this.billerEffectiveTo = billerEffectiveTo;
    }

    public String getBillerStatus() {
        return billerStatus;
    }

    public void setBillerStatus(String billerStatus) {
        this.billerStatus = billerStatus;
    }

    public String getTempDeactivationStart() {
        return tempDeactivationStart;
    }

    public void setTempDeactivationStart(String tempDeactivationStart) {
        this.tempDeactivationStart = tempDeactivationStart;
    }

    public String getTempDeactivationEnd() {
        return tempDeactivationEnd;
    }

    public void setTempDeactivationEnd(String tempDeactivationEnd) {
        this.tempDeactivationEnd = tempDeactivationEnd;
    }

    public String getBillerCreatedDate() {
        return billerCreatedDate;
    }

    public void setBillerCreatedDate(String billerCreatedDate) {
        this.billerCreatedDate = billerCreatedDate;
    }

    public String getBillerLastmodifiedDate() {
        return billerLastmodifiedDate;
    }

    public void setBillerLastmodifiedDate(String billerLastmodifiedDate) {
        this.billerLastmodifiedDate = billerLastmodifiedDate;
    }

    public List<Authenticator> getAuthenticators() {
        return authenticators;
    }

    public void setAuthenticators(List<Authenticator> authenticators) {
        this.authenticators = authenticators;
    }

    public String getBillerLogo() {
        return billerLogo;
    }

    public void setBillerLogo(String billerLogo) {
        this.billerLogo = billerLogo;
    }

    public String getBillerBillCopy() {
        return billerBillCopy;
    }

    public void setBillerBillCopy(String billerBillCopy) {
        this.billerBillCopy = billerBillCopy;
    }

    public String getPartialPay() {
        return partialPay;
    }

    public void setPartialPay(String partialPay) {
        this.partialPay = partialPay;
    }

    public String getPayAfterDuedate() {
        return payAfterDuedate;
    }

    public void setPayAfterDuedate(String payAfterDuedate) {
        this.payAfterDuedate = payAfterDuedate;
    }

    public String getOnlineValidation() {
        return onlineValidation;
    }

    public void setOnlineValidation(String onlineValidation) {
        this.onlineValidation = onlineValidation;
    }

    public List<CustomerConvFee> getCustomerConvFee() {
        return customerConvFee;
    }

    public void setCustomerConvFee(List<CustomerConvFee> customerConvFee) {
        this.customerConvFee = customerConvFee;
    }

    public String getPaymentamountValidation() {
        return paymentamountValidation;
    }

    public void setPaymentamountValidation(String paymentamountValidation) {
        this.paymentamountValidation = paymentamountValidation;
    }

    public List<AdditionalValidationDetail> getAdditionalValidationDetails() {
        return additionalValidationDetails;
    }

    public void setAdditionalValidationDetails(List<AdditionalValidationDetail> additionalValidationDetails) {
        this.additionalValidationDetails = additionalValidationDetails;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("billerid", billerid).append("objectid", objectid).append("sourceid", sourceid).append("billerLegalName", billerLegalName).append("billerName", billerName).append("billerLocation", billerLocation).append("billerLocationDesc", billerLocationDesc).append("billerCategory", billerCategory).append("billerRegAddress", billerRegAddress).append("billerRegCity", billerRegCity).append("billerRegPin", billerRegPin).append("billerRegState", billerRegState).append("billerRegCountry", billerRegCountry).append("isbillerbbps", isbillerbbps).append("currency", currency).append("billerType", billerType).append("billerMode", billerMode).append("allowedPaymentMethods", allowedPaymentMethods).append("paymentChannels", paymentChannels).append("billerEffectiveFrom", billerEffectiveFrom).append("billerEffectiveTo", billerEffectiveTo).append("billerStatus", billerStatus).append("tempDeactivationStart", tempDeactivationStart).append("tempDeactivationEnd", tempDeactivationEnd).append("billerCreatedDate", billerCreatedDate).append("billerLastmodifiedDate", billerLastmodifiedDate).append("authenticators", authenticators).append("billerLogo", billerLogo).append("billerBillCopy", billerBillCopy).append("partialPay", partialPay).append("payAfterDuedate", payAfterDuedate).append("onlineValidation", onlineValidation).append("customerConvFee", customerConvFee).append("paymentamountValidation", paymentamountValidation).append("additionalValidationDetails", additionalValidationDetails).toString();

    }

}
