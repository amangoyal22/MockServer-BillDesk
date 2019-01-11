
package com.example.billdesk.model.billeraccount;

import java.io.Serializable;

public class Metadata implements Serializable
{

    private Agent agent;
    private Device device;
    /**
     * No args constructor for use in serialization
     * 
     */
    public Metadata() {
    }

    /**
     * 
     * @param device
     * @param agent
     */
    public Metadata(Agent agent, Device device) {
        super();
        this.agent = agent;
        this.device = device;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("agent", agent).append("device", device).toString();
    }

}
