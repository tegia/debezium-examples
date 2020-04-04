package io.debezium.examples.aggregation.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LatestAddress {

    private DefaultId addressId;

    // private DefaultId customerId;
    private String fullLocation;
    // private Address latest;

    public LatestAddress() {}

    @JsonCreator
    public LatestAddress(
            @JsonProperty("service_address_id") DefaultId addressId,
            // @JsonProperty("customerId") DefaultId customerId,
            // @JsonProperty("latest") Address latest,
            @JsonProperty("full_location") String fullLocation) {
        this.addressId = addressId;
        // this.customerId = customerId;
        // this.latest = latest;
        this.fullLocation = fullLocation;
    }

    public void update(
        // Address address,
     DefaultId addressId,
    //   DefaultId customerId, 
     String fullLocation) {
        // if(EventType.DELETE == address.get_eventType()) {
        //     latest = null;
        //     return;
        // }
        // latest = address;
        this.addressId = addressId;
        // this.customerId = customerId;
        this.fullLocation = fullLocation;
    }

    public DefaultId getAddressId() {
        return addressId;
    }

    // public DefaultId getCustomerId() {
    //     return customerId;
    // }

    // public Address getLatest() {
    //     return latest;
    // }

    public String getFullLocation() {
        return fullLocation;
    }
    @Override
    public String toString() {
        return "LatestChild{" +
            "service_address_id=" + addressId +
            // ", customerId=" + customerId +
            // ", latest=" + latest +
            ", fullLocation=" + fullLocation +
            '}';
    }
}
