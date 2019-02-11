package com.comcast.commercial.schemafiles.rest.publishservice;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


@Generated("org.jsonschema2pojo")
public class ErrorDetail {

    private String errorCode;
    private String errorDescription;

    /**
     * 
     * @return
     *     The errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 
     * @param errorCode
     *     The errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 
     * @return
     *     The errorDescription
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * 
     * @param errorDescription
     *     The errorDescription
     */
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(errorCode).append(errorDescription).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ErrorDetail) == false) {
            return false;
        }
        ErrorDetail rhs = ((ErrorDetail) other);
        return new EqualsBuilder().append(errorCode, rhs.errorCode).append(errorDescription, rhs.errorDescription).isEquals();
    }

}
