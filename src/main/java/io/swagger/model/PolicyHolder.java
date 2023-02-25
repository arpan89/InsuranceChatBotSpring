package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PolicyHolder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-12T07:11:07.511Z")


public class PolicyHolder   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("address")
  private String addressId = null;

  public PolicyHolder firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the policy holder
   * @return firstName
  **/
  @ApiModelProperty(value = "The first name of the policy holder")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PolicyHolder lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the policy holder
   * @return lastName
  **/
  @ApiModelProperty(value = "The last name of the policy holder")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PolicyHolder email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the policy holder
   * @return email
  **/
  @ApiModelProperty(value = "The email address of the policy holder")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PolicyHolder address(String addressId) {
    this.addressId = addressId;
    return this;
  }

  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolicyHolder that = (PolicyHolder) o;
    return firstName.equals(that.firstName) && lastName.equals(that.lastName) && email.equals(that.email) && addressId.equals(that.addressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, addressId);
  }

  @Override
  public String toString() {
    return "PolicyHolder{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", addressId='" + addressId + '\'' +
            '}';
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid


  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

