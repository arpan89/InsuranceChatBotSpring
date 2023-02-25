package io.swagger.entity;

import org.threeten.bp.LocalDate;

import javax.persistence.*;
import java.util.Objects;

/**
 * Claim
 */
@Entity
public class ClaimEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Long claimId;

  @Column
  private String claimNumber;

  @Column
  private String policyId;

  @Column
  private LocalDate dateOfIncident;

  @Column
  private String description;

  @Column
  private String status;

  @Column
  private Float amount;

  public Long getClaimId() {
    return claimId;
  }

  public void setClaimId(Long claimId) {
    this.claimId = claimId;
  }

  public ClaimEntity claimNumber(String claimNumber) {
    this.claimNumber = claimNumber;
    return this;
  }

  public String getClaimNumber() {
    return claimNumber;
  }

  public void setClaimNumber(String claimNumber) {
    this.claimNumber = claimNumber;
  }

  public ClaimEntity policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * The unique identifier of the policy associated with the claim
   * @return policyId
  **/

  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public ClaimEntity dateOfIncident(LocalDate dateOfIncident) {
    this.dateOfIncident = dateOfIncident;
    return this;
  }

  public LocalDate getDateOfIncident() {
    return dateOfIncident;
  }

  public void setDateOfIncident(LocalDate dateOfIncident) {
    this.dateOfIncident = dateOfIncident;
  }

  public ClaimEntity description(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClaimEntity status(String status) {
    this.status = status;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ClaimEntity amount(Float amount) {
    this.amount = amount;
    return this;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClaimEntity claimEntity = (ClaimEntity) o;
    return claimId.equals(claimEntity.claimId) && claimNumber.equals(claimEntity.claimNumber) && policyId.equals(claimEntity.policyId) && dateOfIncident.equals(claimEntity.dateOfIncident) && description.equals(claimEntity.description) && status.equals(claimEntity.status) && amount.equals(claimEntity.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, claimNumber, policyId, dateOfIncident, description, status, amount);
  }

  @Override
  public String toString() {
    return "Claim{" +
            "claimId=" + claimId +
            ", claimNumber='" + claimNumber + '\'' +
            ", policyId='" + policyId + '\'' +
            ", dateOfIncident=" + dateOfIncident +
            ", description='" + description + '\'' +
            ", status='" + status + '\'' +
            ", amount=" + amount +
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

