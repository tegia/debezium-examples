package io.debezium.examples.aggregation.model;

import com.fasterxml.jackson.annotation.*;

public class NewAddress {
    private DefaultId service_address_id;
    private String full_location;

    public NewAddress() {
    }

    @JsonCreator
    public NewAddress(@JsonProperty("service_address_id") DefaultId service_address_id,
            @JsonProperty("full_location") String full_location) {
        this.service_address_id = service_address_id;
        this.full_location = full_location;
    }

    public void update(String full_location, DefaultId service_address_id) {
        // if (EventType.DELETE == address.get_eventType()) {
        // latest = null;
        // return;
        // }
        this.full_location = full_location;
        this.service_address_id = service_address_id;
    }

    @Override
    public String toString() {
        return "Separate service{" + "service_address_id=" + service_address_id + ", full_location=" + full_location
                + '}';
    }
}
