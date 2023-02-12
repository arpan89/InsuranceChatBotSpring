package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Claim
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-12T07:11:07.511Z")


public class Claim   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("claimNumber")
  private String claimNumber = null;

  @JsonProperty("policyId")
  private String policyId = null;

  @JsonProperty("dateOfIncident")
  private LocalDate dateOfIncident = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("amount")
  private Float amount = null;

  public Claim id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the claim
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier for the claim")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Claim claimNumber(String claimNumber) {
    this.claimNumber = claimNumber;
    return this;
  }

  /**
   * The claim number assigned to the claim
   * @return claimNumber
  **/
  @ApiModelProperty(value = "The claim number assigned to the claim")


  public String getClaimNumber() {
    return claimNumber;
  }

  public void setClaimNumber(String claimNumber) {
    this.claimNumber = claimNumber;
  }

  public Claim policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * The unique identifier of the policy associated with the claim
   * @return policyId
  **/
  @ApiModelProperty(value = "The unique identifier of the policy associated with the claim")


  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public Claim dateOfIncident(LocalDate dateOfIncident) {
    this.dateOfIncident = dateOfIncident;
    return this;
  }

  /**
   * The date of the incident that led to the claim
   * @return dateOfIncident
  **/
  @ApiModelProperty(value = "The date of the incident that led to the claim")

  @Valid

  public LocalDate getDateOfIncident() {
    return dateOfIncident;
  }

  public void setDateOfIncident(LocalDate dateOfIncident) {
    this.dateOfIncident = dateOfIncident;
  }

  public Claim description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the incident that led to the claim
   * @return description
  **/
  @ApiModelProperty(value = "A description of the incident that led to the claim")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Claim status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of the claim (e.g. open, closed, in progress)
   * @return status
  **/
  @ApiModelProperty(value = "The current status of the claim (e.g. open, closed, in progress)")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Claim amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount being claimed
   * @return amount
  **/
  @ApiModelProperty(value = "The amount being claimed")


  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Claim claim = (Claim) o;
    return Objects.equals(this.id, claim.id) &&
        Objects.equals(this.claimNumber, claim.claimNumber) &&
        Objects.equals(this.policyId, claim.policyId) &&
        Objects.equals(this.dateOfIncident, claim.dateOfIncident) &&
        Objects.equals(this.description, claim.description) &&
        Objects.equals(this.status, claim.status) &&
        Objects.equals(this.amount, claim.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, claimNumber, policyId, dateOfIncident, description, status, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Claim {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    claimNumber: ").append(toIndentedString(claimNumber)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    dateOfIncident: ").append(toIndentedString(dateOfIncident)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

