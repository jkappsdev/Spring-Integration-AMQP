
package com.comcast.commercial.schemafiles.rest.publishservice;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class MessagePublicationServiceResponse {

    private PublishResponse publishResponse;

    /**
     * 
     * @return
     *     The publishResponse
     */
    public PublishResponse getPublishResponse() {
        return publishResponse;
    }

    /**
     * 
     * @param publishResponse
     *     The publishResponse
     */
    public void setPublishResponse(PublishResponse publishResponse) {
        this.publishResponse = publishResponse;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(publishResponse).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MessagePublicationServiceResponse) == false) {
            return false;
        }
        MessagePublicationServiceResponse rhs = ((MessagePublicationServiceResponse) other);
        return new EqualsBuilder().append(publishResponse, rhs.publishResponse).isEquals();
    }

}
