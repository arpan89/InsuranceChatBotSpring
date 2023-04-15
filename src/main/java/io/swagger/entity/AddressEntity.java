package io.swagger.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * Address
 */
@Entity
@Table(name="address")
public class AddressEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Long addressId;

  @Column
  private String street;

  @Column
  private String city;

  @Column
  private String state;

  @Column
  private String zipCode;

  public AddressEntity street(String street) {
    this.street = street;
    return this;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public AddressEntity city(String city) {
    this.city = city;
    return this;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressEntity state(String state) {
    this.state = state;
    return this;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressEntity zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressEntity addressEntity = (AddressEntity) o;
    return Objects.equals(this.street, addressEntity.street) &&
        Objects.equals(this.city, addressEntity.city) &&
        Objects.equals(this.state, addressEntity.state) &&
        Objects.equals(this.zipCode, addressEntity.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, city, state, zipCode);
  }

  @Override
  public String toString() {
    return "Address{" +
            "addressId=" + addressId +
            ", street='" + street + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", zipCode='" + zipCode + '\'' +
            '}';
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

