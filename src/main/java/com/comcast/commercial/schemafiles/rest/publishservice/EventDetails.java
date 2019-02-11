
package com.comcast.commercial.schemafiles.rest.publishservice;

import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class EventDetails {

    /**
     * 
     * (Required)
     * 
     */
    private String xml;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The xml
     */
    public String getXml() {
        return xml;
    }

    /**
     * 
     * (Required)
     * 
     * @param xml
     *     The xml
     */
    public void setXml(String xml) {
        this.xml = xml;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(xml).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventDetails) == false) {
            return false;
        }
        EventDetails rhs = ((EventDetails) other);
        return new EqualsBuilder().append(xml, rhs.xml).isEquals();
    }

}
