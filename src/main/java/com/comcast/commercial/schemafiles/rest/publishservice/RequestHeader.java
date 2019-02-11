
package com.comcast.commercial.schemafiles.rest.publishservice;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class RequestHeader {

    private String trackingId;

    /**
     * 
     * @return
     *     The trackingId
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * 
     * @param trackingId
     *     The trackingId
     */
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(trackingId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestHeader) == false) {
            return false;
        }
        RequestHeader rhs = ((RequestHeader) other);
        return new EqualsBuilder().append(trackingId, rhs.trackingId).isEquals();
    }

}
