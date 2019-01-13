
package com.example.billdesk.model.bill;

import java.io.Serializable;



public class LineItem implements Serializable
{

    private String description;
    private String amount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LineItem() {
    }

    /**
     * 
     * @param amount
     * @param description
     */
    public LineItem(String description, String amount) {
        super();
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("description", description).append("amount", amount).toString();
    }

}
