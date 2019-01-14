
package com.example.billdesk.model.payment;

import java.io.Serializable;
import java.util.List;
public class Link implements Serializable
{

    private String url;
    private String method;
    private String rel;
    private List<Parameter> parameters = null;
    private String validDate;
    private final static long serialVersionUID = 4114533075247161712L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Link() {
    }

    /**
     * 
     * @param validDate
     * @param method
     * @param parameters
     * @param rel
     * @param url
     */
    public Link(String url, String method, String rel, List<Parameter> parameters, String validDate) {
        super();
        this.url = url;
        this.method = method;
        this.rel = rel;
        this.parameters = parameters;
        this.validDate = validDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    @Override
    public String toString() {
        return "";//new ToStringBuilder(this).append("url", url).append("method", method).append("rel", rel).append("parameters", parameters).append("validDate", validDate).toString();
    }

}
