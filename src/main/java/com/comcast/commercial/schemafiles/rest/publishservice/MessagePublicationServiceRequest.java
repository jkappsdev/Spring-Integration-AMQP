
package com.comcast.commercial.schemafiles.rest.publishservice;

import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder; 

@Generated("org.jsonschema2pojo")
public class MessagePublicationServiceRequest {

    /**
     * 
     * (Required)
     * 
     */
    private PublishRequest publishRequest;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The publishRequest
     */
    public PublishRequest getPublishRequest() {
        return publishRequest;
    }

    /**
     * 
     * (Required)
     * 
     * @param publishRequest
     *     The publishRequest
     */
    public void setPublishRequest(PublishRequest publishRequest) {
        this.publishRequest = publishRequest;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(publishRequest).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MessagePublicationServiceRequest) == false) {
            return false;
        }
        MessagePublicationServiceRequest rhs = ((MessagePublicationServiceRequest) other);
        return new EqualsBuilder().append(publishRequest, rhs.publishRequest).isEquals();
    }

}
