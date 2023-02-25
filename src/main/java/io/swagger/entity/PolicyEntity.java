package io.swagger.entity;

import org.threeten.bp.LocalDate;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Policy
 */
//@Component
@Entity
@Table(name="policy")
public class PolicyEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long policyId;

  @Column
  private String policyNumber;

  @Column
  private Date startDate;

  @Column
  private Date endDate;

  @Column
  private Float premiumAmount;

  @Column
  private Long policyHolderId;

  public PolicyEntity() {

  }

  public PolicyEntity id(Long id) {
    this.policyId = id;
    return this;
  }

  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public PolicyEntity policyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public PolicyEntity startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public PolicyEntity endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public PolicyEntity premiumAmount(Float premiumAmount) {
    this.premiumAmount = premiumAmount;
    return this;
  }

  public Float getPremiumAmount() {
    return premiumAmount;
  }

  public void setPremiumAmount(Float premiumAmount) {
    this.premiumAmount = premiumAmount;
  }

  public PolicyEntity policyHolder(Long policyHolderId) {
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
    PolicyEntity policyEntity = (PolicyEntity) o;
    return policyId.equals(policyEntity.policyId) && policyNumber.equals(policyEntity.policyNumber) && startDate.equals(policyEntity.startDate) && endDate.equals(policyEntity.endDate) && premiumAmount.equals(policyEntity.premiumAmount) && policyHolderId.equals(policyEntity.policyHolderId);
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

