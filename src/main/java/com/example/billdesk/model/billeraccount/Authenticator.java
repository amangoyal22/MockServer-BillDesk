
package com.example.billdesk.model.billeraccount;

import java.io.Serializable;
public class Authenticator implements Serializable
{


    private String seq;
    private String parameterName;
    private String value;
    /**
     * No args constructor for use in serialization
     * 
     */
    public Authenticator() {
    }

    /**
     * 
     * @param value
     * @param seq
     * @param parameterName
     */
    public Authenticator(String seq, String parameterName, String value) {
        super();
        this.seq = seq;
        this.parameterName = parameterName;
        this.value = value;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("seq", seq).append("parameterName", parameterName).append("value", value).toString();
    }

}
