
package com.comcast.commercial.schemafiles.rest.publishservice;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
@Generated("org.jsonschema2pojo")
public class Event {

    /**
     * 
     * (Required)
     * 
     */
    private String eventName;
    /**
     * 
     * (Required)
     * 
     */
    private EventDetails eventDetails;
    private List<Property> properties = new ArrayList<Property>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * 
     * (Required)
     * 
     * @param eventName
     *     The eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The eventDetails
     */
    public EventDetails getEventDetails() {
        return eventDetails;
    }

    /**
     * 
     * (Required)
     * 
     * @param eventDetails
     *     The eventDetails
     */
    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    /**
     * 
     * @return
     *     The properties
     */
    public List<Property> getProperties() {
        return properties;
    }

    /**
     * 
     * @param properties
     *     The properties
     */
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eventName).append(eventDetails).append(properties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return new EqualsBuilder().append(eventName, rhs.eventName).append(eventDetails, rhs.eventDetails).append(properties, rhs.properties).isEquals();
    }

}
