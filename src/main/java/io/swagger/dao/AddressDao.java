package io.swagger.dao;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AddressDao {

    private String city;
    private String state;
    private String street;
    private String zipCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDao that = (AddressDao) o;
        return city.equals(that.city) && state.equals(that.state) && street.equals(that.street) && zipCode.equals(that.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, state, street, zipCode);
    }

    @Override
    public String toString() {
        return "AddressDao{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
