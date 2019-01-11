
package com.example.billdesk.model.biller;

import java.io.Serializable;
import java.util.List;


public class AdditionalValidationDetail implements Serializable
{


    private String parameterName;
    private String dataType;
    private Boolean optional;
    private String regex;
    private String errorMessage;
    private List<ListOfValue> listOfValues = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AdditionalValidationDetail() {
    }

    /**
     * 
     * @param errorMessage
     * @param dataType
     * @param regex
     * @param optional
     * @param listOfValues
     * @param parameterName
     */
    public AdditionalValidationDetail(String parameterName, String dataType, Boolean optional, String regex, String errorMessage, List<ListOfValue> listOfValues) {
        super();
        this.parameterName = parameterName;
        this.dataType = dataType;
        this.optional = optional;
        this.regex = regex;
        this.errorMessage = errorMessage;
        this.listOfValues = listOfValues;
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

    public List<ListOfValue> getListOfValues() {
        return listOfValues;
    }

    public void setListOfValues(List<ListOfValue> listOfValues) {
        this.listOfValues = listOfValues;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("parameterName", parameterName).append("dataType", dataType).append("optional", optional).append("regex", regex).append("errorMessage", errorMessage).append("listOfValues", listOfValues).toString();
    }

}
