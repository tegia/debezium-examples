package io.debezium.examples.aggregation.model;

import com.fasterxml.jackson.annotation.*;

public class Address {

    private final EventType _eventType;

    private final Integer id;
    private final Integer account_id;
    private final String street;
    private final String city;
    private final String house_number;
    private final String zip_code;
    private final String apartment_number;
    private final String phone;
    private final String email;
    private final String last_update;
    @JsonCreator
    public Address(
            @JsonProperty("_eventType") EventType _eventType,
            @JsonProperty("id") Integer id,
            @JsonProperty("account_id") Integer account_id,
            @JsonProperty("street") String street,
            @JsonProperty("city") String city,
            @JsonProperty("house_number") String house_number,
            @JsonProperty("zip_code") String zip_code,
            @JsonProperty("apartment_number") String apartment_number,
            @JsonProperty("phone") String phone,
            @JsonProperty("email") String email,
            @JsonProperty("last_update") String last_update) {
        this._eventType = _eventType == null ? EventType.UPSERT : _eventType;
        this.id = id;
        this.account_id = account_id;
        this.street = street;
        this.city = city;
        this.house_number = house_number;
        this.zip_code = zip_code;
        this.apartment_number = apartment_number;
        this.phone = phone;
        this.email = email;
        this.last_update = last_update;
    }

    public String getLastUpdate() {
        return last_update;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public EventType get_eventType() {
        return _eventType;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAccountId() {
        return account_id;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getHouseNumber() {
        return house_number;
    }

    public String getZipCode() {
        return zip_code;
    }

    public String getApartmentNumber() {
        return apartment_number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "_eventType='" + _eventType + '\'' +
                ", id=" + id +
                ", account_id=" + account_id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", house_number='" + house_number + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", apartment_number='" + apartment_number + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", last_update='" + last_update + '\'' +
                '}';
    }

}
