package io.swagger.dao;

import org.springframework.stereotype.Component;
import org.threeten.bp.LocalDate;

@Component
public class PolicyDao {

    private String policyNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private Float premiumAmount;
    private Long policyHolderId;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Float getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(Float premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public Long getPolicyHolderId() {
        return policyHolderId;
    }

    public void setPolicyHolderId(Long policyHolderId) {
        this.policyHolderId = policyHolderId;
    }
}
