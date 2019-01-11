
package com.example.billdesk.model.billeraccount;

import java.io.Serializable;

public class Customer implements Serializable
{

    private String firstname;
    private String lastname;
    private String mobile;
    private String mobileAlt;
    private String email;
    private String emailAlt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Customer() {
    }

    /**
     * 
     * @param email
     * @param mobileAlt
     * @param lastname
     * @param firstname
     * @param emailAlt
     * @param mobile
     */
    public Customer(String firstname, String lastname, String mobile, String mobileAlt, String email, String emailAlt) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile = mobile;
        this.mobileAlt = mobileAlt;
        this.email = email;
        this.emailAlt = emailAlt;
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

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("firstname", firstname).append("lastname", lastname).append("mobile", mobile).append("mobileAlt", mobileAlt).append("email", email).append("emailAlt", emailAlt).toString();
    }

}
