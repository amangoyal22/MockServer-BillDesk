
package com.example.billdesk.model.payment;

import java.io.Serializable;

public class Parameter implements Serializable
{

    private String name;
    private String value;
    /**
     * No args constructor for use in serialization
     * 
     */
    public Parameter() {
    }

    /**
     * 
     * @param name
     * @param value
     */
    public Parameter(String name, String value) {
        super();
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("name", name).append("value", value).toString();
    }

}
