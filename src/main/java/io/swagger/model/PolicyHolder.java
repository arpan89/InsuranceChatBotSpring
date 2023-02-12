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
  private Address address = null;

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

  public PolicyHolder address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyHolder policyHolder = (PolicyHolder) o;
    return Objects.equals(this.firstName, policyHolder.firstName) &&
        Objects.equals(this.lastName, policyHolder.lastName) &&
        Objects.equals(this.email, policyHolder.email) &&
        Objects.equals(this.address, policyHolder.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyHolder {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

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

