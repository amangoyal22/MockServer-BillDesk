
package com.example.billdesk.model.validation;

import java.io.Serializable;

public class AdditionalValidationDetail implements Serializable
{

    private String parameterName;
    private String value;
    /**
     * No args constructor for use in serialization
     * 
     */
    public AdditionalValidationDetail() {
    }

    /**
     * 
     * @param value
     * @param parameterName
     */
    public AdditionalValidationDetail(String parameterName, String value) {
        super();
        this.parameterName = parameterName;
        this.value = value;
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
        return "";//new ToStringBuilder(this).append("parameterName", parameterName).append("value", value).toString();
    }

}
