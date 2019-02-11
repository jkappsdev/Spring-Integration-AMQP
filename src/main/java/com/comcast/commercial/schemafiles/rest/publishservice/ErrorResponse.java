
package com.comcast.commercial.schemafiles.rest.publishservice;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ErrorResponse {

    private List<ErrorDetail> errorDetails = new ArrayList<ErrorDetail>();

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
        return new HashCodeBuilder().append(errorDetails).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ErrorResponse) == false) {
            return false;
        }
        ErrorResponse rhs = ((ErrorResponse) other);
        return new EqualsBuilder().append(errorDetails, rhs.errorDetails).isEquals();
    }

}
