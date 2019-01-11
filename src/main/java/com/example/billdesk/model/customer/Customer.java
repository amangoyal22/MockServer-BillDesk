
package com.example.billdesk.model.customer;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Customer implements Serializable
{


    private String customerid;
    private String salutation;
    private String firstname;
    private String lastname;
    private String email;
    private String emailAlt;
    private String mobile;
    private String mobileAlt;
    private String address;
    private String addressAlt;
    private String city;
    private String state;
    private String country;
    private String pincode;
    private String status;


    public Customer() {
    }

    /**
     * 
     * @param status
     * @param state
     * @param lastname
     * @param addressAlt
     * @param firstname
     * @param country
     * @param city
     * @param pincode
     * @param customerid
     * @param email
     * @param mobileAlt
     * @param address
     * @param salutation
     * @param emailAlt
     * @param mobile
     */
    public Customer(String customerid, String salutation, String firstname, String lastname, String email, String emailAlt, String mobile, String mobileAlt, String address, String addressAlt, String city, String state, String country, String pincode, String status) {
        super();
        this.customerid = customerid;
        this.salutation = salutation;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.emailAlt = emailAlt;
        this.mobile = mobile;
        this.mobileAlt = mobileAlt;
        this.address = address;
        this.addressAlt = addressAlt;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder x= new StringBuilder();
        return  x.append("customerid:"+ customerid).append("salutation:"+ salutation).append("firstname:"+ firstname).append("lastname:"+lastname).append("email:"+ email).append("emailAlt:"+emailAlt).append("mobile:"+mobile).append("mobileAlt:"+mobileAlt).append("address:"+address).append("addressAlt:"+addressAlt).append("city:"+city).append("state:"+state).append("country:"+country).append("pincode:"+pincode).append("status:"+status).toString();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailAlt() {
        return emailAlt;
    }

    public void setEmailAlt(String emailAlt) {
        this.emailAlt = emailAlt;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileAlt() {
        return mobileAlt;
    }

    public void setMobileAlt(String mobileAlt) {
        this.mobileAlt = mobileAlt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressAlt() {
        return addressAlt;
    }

    public void setAddressAlt(String addressAlt) {
        this.addressAlt = addressAlt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
