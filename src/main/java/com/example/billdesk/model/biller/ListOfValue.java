
package com.example.billdesk.model.biller;

import java.io.Serializable;
public class ListOfValue implements Serializable
{


    private String name;
    private String value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListOfValue() {
    }

    /**
     * 
     * @param name
     * @param value
     */
    public ListOfValue(String name, String value) {
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
