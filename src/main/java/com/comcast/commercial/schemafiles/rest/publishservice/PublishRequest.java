
package com.comcast.commercial.schemafiles.rest.publishservice;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PublishRequest {

    private RequestHeader requestHeader;
    private String id;
    private PublishRequest.Intent intent;
    private PublishRequest.Status status;
    private String parentId;
    private String businessParam;
    /**
     * 
     * (Required)
     * 
     */
    private String participant;
    /**
     * 
     * (Required)
     * 
     */
    private Event event;

    /**
     * 
     * @return
     *     The requestHeader
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * 
     * @param requestHeader
     *     The requestHeader
     */
    public void setRequestHeader(RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }

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
     *     The intent
     */
    public PublishRequest.Intent getIntent() {
        return intent;
    }

    /**
     * 
     * @param intent
     *     The intent
     */
    public void setIntent(PublishRequest.Intent intent) {
        this.intent = intent;
    }

    /**
     * 
     * @return
     *     The status
     */
    public PublishRequest.Status getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(PublishRequest.Status status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The parentId
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 
     * @param parentId
     *     The parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 
     * @return
     *     The businessParam
     */
    public String getBusinessParam() {
        return businessParam;
    }

    /**
     * 
     * @param businessParam
     *     The businessParam
     */
    public void setBusinessParam(String businessParam) {
        this.businessParam = businessParam;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The participant
     */
    public String getParticipant() {
        return participant;
    }

    /**
     * 
     * (Required)
     * 
     * @param participant
     *     The participant
     */
    public void setParticipant(String participant) {
        this.participant = participant;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The event
     */
    public Event getEvent() {
        return event;
    }

    /**
     * 
     * (Required)
     * 
     * @param event
     *     The event
     */
    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(requestHeader).append(id).append(intent).append(status).append(parentId).append(businessParam).append(participant).append(event).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PublishRequest) == false) {
            return false;
        }
        PublishRequest rhs = ((PublishRequest) other);
        return new EqualsBuilder().append(requestHeader, rhs.requestHeader).append(id, rhs.id).append(intent, rhs.intent).append(status, rhs.status).append(parentId, rhs.parentId).append(businessParam, rhs.businessParam).append(participant, rhs.participant).append(event, rhs.event).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public enum Intent {

        RELAY("RELAY"),
        PERSIST("PERSIST");
        private final String value;
        private final static Map<String, PublishRequest.Intent> CONSTANTS = new HashMap<String, PublishRequest.Intent>();

        static {
            for (PublishRequest.Intent c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Intent(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static PublishRequest.Intent fromValue(String value) {
            PublishRequest.Intent constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public enum Status {

        PROCESSING_COMPLETED("PROCESSING_COMPLETED"),
        PROCESSING_ERRORED("PROCESSING_ERRORED"),
        RETRY_IN_PROGRESS("RETRY_IN_PROGRESS"),
        ENRICHED_REQUEST_COMPLETE("ENRICHED_REQUEST_COMPLETE");
        private final String value;
        private final static Map<String, PublishRequest.Status> CONSTANTS = new HashMap<String, PublishRequest.Status>();

        static {
            for (PublishRequest.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static PublishRequest.Status fromValue(String value) {
            PublishRequest.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
