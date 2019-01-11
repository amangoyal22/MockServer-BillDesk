
package com.example.billdesk.model.biller;

import java.io.Serializable;
import java.util.List;

public class Authenticator implements Serializable
{


    private String seq;
    private String parameterName;
    private String dataType;
    private Boolean optional;
    private String regex;
    private String errorMessage;
    private String encryptionRequired;
    private List<ListOfValue> listOfValues = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Authenticator() {
    }

    /**
     * 
     * @param errorMessage
     * @param dataType
     * @param regex
     * @param optional
     * @param seq
     * @param listOfValues
     * @param encryptionRequired
     * @param parameterName
     */
    public Authenticator(String seq, String parameterName, String dataType, Boolean optional, String regex, String errorMessage, String encryptionRequired, List<ListOfValue> listOfValues) {
        super();
        this.seq = seq;
        this.parameterName = parameterName;
        this.dataType = dataType;
        this.optional = optional;
        this.regex = regex;
        this.errorMessage = errorMessage;
        this.encryptionRequired = encryptionRequired;
        this.listOfValues = listOfValues;
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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getEncryptionRequired() {
        return encryptionRequired;
    }

    public void setEncryptionRequired(String encryptionRequired) {
        this.encryptionRequired = encryptionRequired;
    }

    public List<ListOfValue> getListOfValues() {
        return listOfValues;
    }

    public void setListOfValues(List<ListOfValue> listOfValues) {
        this.listOfValues = listOfValues;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("seq", seq).append("parameterName", parameterName).append("dataType", dataType).append("optional", optional).append("regex", regex).append("errorMessage", errorMessage).append("encryptionRequired", encryptionRequired).append("listOfValues", listOfValues).toString();
    }

}
