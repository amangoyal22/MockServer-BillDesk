
package com.example.billdesk.model.oneview;

import java.io.Serializable;
import java.util.List;

import com.example.billdesk.model.bill.Bill;
import com.example.billdesk.model.billeraccount.BillerAccount;


public class Oneview implements Serializable
{

    private String objectid;
    private String sourceid;
    private String customerid;
    private BillerAccount billeraccount;
    private List<Bill> billlist = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Oneview() {
    }

    /**
     * 
     * @param billlist
     * @param billeraccount
     * @param customerid
     * @param sourceid
     * @param objectid
     */
    public Oneview(String objectid, String sourceid, String customerid, BillerAccount billeraccount, List<Bill> billlist) {
        super();
        this.objectid = objectid;
        this.sourceid = sourceid;
        this.customerid = customerid;
        this.billeraccount = billeraccount;
        this.billlist = billlist;
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

    public BillerAccount getBilleraccount() {
        return billeraccount;
    }

    public void setBilleraccount(BillerAccount billeraccount) {
        this.billeraccount = billeraccount;
    }

    public List<Bill> getBilllist() {
        return billlist;
    }

    public void setBilllist(List<Bill> billlist) {
        this.billlist = billlist;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("objectid", objectid).append("sourceid", sourceid).append("customerid", customerid).append("billeraccount", billeraccount).append("billlist", billlist).toString();
    }

}
