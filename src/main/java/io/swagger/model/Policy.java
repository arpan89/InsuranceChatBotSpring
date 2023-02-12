package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PolicyHolder;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Policy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-12T07:11:07.511Z")


public class Policy   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("policyNumber")
  private String policyNumber = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("premiumAmount")
  private Float premiumAmount = null;

  @JsonProperty("policyHolder")
  private PolicyHolder policyHolder = null;

  public Policy id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the policy
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier for the policy")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Policy policyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

  /**
   * The policy number assigned to the policy
   * @return policyNumber
  **/
  @ApiModelProperty(value = "The policy number assigned to the policy")


  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public Policy startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the policy
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date of the policy")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Policy endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The end date of the policy
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date of the policy")

  @Valid

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Policy premiumAmount(Float premiumAmount) {
    this.premiumAmount = premiumAmount;
    return this;
  }

  /**
   * The premium amount for the policy
   * @return premiumAmount
  **/
  @ApiModelProperty(value = "The premium amount for the policy")


  public Float getPremiumAmount() {
    return premiumAmount;
  }

  public void setPremiumAmount(Float premiumAmount) {
    this.premiumAmount = premiumAmount;
  }

  public Policy policyHolder(PolicyHolder policyHolder) {
    this.policyHolder = policyHolder;
    return this;
  }

  /**
   * Get policyHolder
   * @return policyHolder
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PolicyHolder getPolicyHolder() {
    return policyHolder;
  }

  public void setPolicyHolder(PolicyHolder policyHolder) {
    this.policyHolder = policyHolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.id, policy.id) &&
        Objects.equals(this.policyNumber, policy.policyNumber) &&
        Objects.equals(this.startDate, policy.startDate) &&
        Objects.equals(this.endDate, policy.endDate) &&
        Objects.equals(this.premiumAmount, policy.premiumAmount) &&
        Objects.equals(this.policyHolder, policy.policyHolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, policyNumber, startDate, endDate, premiumAmount, policyHolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policyNumber: ").append(toIndentedString(policyNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    premiumAmount: ").append(toIndentedString(premiumAmount)).append("\n");
    sb.append("    policyHolder: ").append(toIndentedString(policyHolder)).append("\n");
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

