package io.swagger.entity;

import org.threeten.bp.LocalDate;

import javax.persistence.*;
import java.util.Objects;

/**
 * Policy
 */
@Entity
public class Policy   {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Long policyId;

  @Column
  private String policyNumber;

  @Column
  private LocalDate startDate;

  @Column
  private LocalDate endDate;

  @Column
  private Float premiumAmount;

  @Column
  private Long policyHolderId;

  public Policy id(Long id) {
    this.policyId = id;
    return this;
  }

  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public Policy policyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

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

  public Float getPremiumAmount() {
    return premiumAmount;
  }

  public void setPremiumAmount(Float premiumAmount) {
    this.premiumAmount = premiumAmount;
  }

  public Policy policyHolder(Long policyHolderId) {
    this.policyHolderId = policyHolderId;
    return this;
  }

  public Long getPolicyHolderId() {
    return policyHolderId;
  }

  public void setPolicyHolderId(Long policyHolderId) {
    this.policyHolderId = policyHolderId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Policy policy = (Policy) o;
    return policyId.equals(policy.policyId) && policyNumber.equals(policy.policyNumber) && startDate.equals(policy.startDate) && endDate.equals(policy.endDate) && premiumAmount.equals(policy.premiumAmount) && policyHolderId.equals(policy.policyHolderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, policyNumber, startDate, endDate, premiumAmount, policyHolderId);
  }

  @Override
  public String toString() {
    return "Policy{" +
            "policyId=" + policyId +
            ", policyNumber='" + policyNumber + '\'' +
            ", startDate=" + startDate +
            ", endDate=" + endDate +
            ", premiumAmount=" + premiumAmount +
            ", policyHolderId=" + policyHolderId +
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

