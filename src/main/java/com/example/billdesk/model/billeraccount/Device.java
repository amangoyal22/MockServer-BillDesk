
package com.example.billdesk.model.billeraccount;

import java.io.Serializable;

public class Device implements Serializable
{

    private String initChannel;
    private String ip;
    private String mac;
    private final static long serialVersionUID = -6870703921006362927L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Device() {
    }

    /**
     * 
     * @param initChannel
     * @param mac
     * @param ip
     */
    public Device(String initChannel, String ip, String mac) {
        super();
        this.initChannel = initChannel;
        this.ip = ip;
        this.mac = mac;
    }

    public String getInitChannel() {
        return initChannel;
    }

    public void setInitChannel(String initChannel) {
        this.initChannel = initChannel;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("initChannel", initChannel).append("ip", ip).append("mac", mac).toString();
    }

}
