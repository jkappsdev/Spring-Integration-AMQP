
package com.comcast.commercial.schemafiles.rest.publishservice;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PublishResponse {

    private String id;
    private String status;
    /**
     * 
     */
    private List<ErrorDetail> errorDetails = new ArrayList<ErrorDetail>();

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The errorDetails
     */
    public List<ErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    /**
     * 
     * @param errorDetails
     *     The errorDetails
     */
    public void setErrorDetails(List<ErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(status).append(errorDetails).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PublishResponse) == false) {
            return false;
        }
        PublishResponse rhs = ((PublishResponse) other);
        return new EqualsBuilder().append(id, rhs.id).append(status, rhs.status).append(errorDetails, rhs.errorDetails).isEquals();
    }

}
