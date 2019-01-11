
package com.example.billdesk.model.billeraccount;

import java.io.Serializable;
public class Agent implements Serializable
{

    private String agentid;
    private String subAgentid;
    public Agent() {
    }

    /**
     * 
     * @param subAgentid
     * @param agentid
     */
    public Agent(String agentid, String subAgentid) {
        super();
        this.agentid = agentid;
        this.subAgentid = subAgentid;
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public String getSubAgentid() {
        return subAgentid;
    }

    public void setSubAgentid(String subAgentid) {
        this.subAgentid = subAgentid;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("agentid", agentid).append("subAgentid", subAgentid).toString();
    }

}
