
package com.example.billdesk.model.bill;

import java.io.Serializable;



public class AdditionalDetail implements Serializable
{

    private String seq;
    private String label;
    private String value;
    private String billfor;
   /**
     * No args constructor for use in serialization
     * 
     */
    public AdditionalDetail() {
    }

    /**
     * 
     * @param billfor
     * @param value
     * @param seq
     * @param label
     */
    public AdditionalDetail(String seq, String label, String value, String billfor) {
        super();
        this.seq = seq;
        this.label = label;
        this.value = value;
        this.billfor = billfor;
    }
    public AdditionalDetail(String seq, String label, String value) {
        super();
        this.seq = seq;
        this.label = label;
        this.value = value;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBillfor() {
        return billfor;
    }

    public void setBillfor(String billfor) {
        this.billfor = billfor;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("seq", seq).append("label", label).append("value", value).append("billfor", billfor).toString();
    }

}
