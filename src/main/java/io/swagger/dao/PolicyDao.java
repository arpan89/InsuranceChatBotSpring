package io.swagger.dao;

import io.swagger.entity.PolicyEntity;
import io.swagger.model.Policy;
import org.springframework.stereotype.Component;
import org.threeten.bp.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class PolicyDao {

    private String policyNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private Float premiumAmount;
    private Long policyHolderId;

    @PersistenceContext
    private EntityManager em;

    public PolicyDao() {

    }

    public PolicyDao(EntityManager em) {
        this.em = em;
    }

    public List<PolicyEntity> findPolicyByStartAndEndDate (String startDate, String endDate) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(startDate);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PolicyEntity> cq = cb.createQuery(PolicyEntity.class);

        Root<PolicyEntity> policy = cq.from(PolicyEntity.class);
        Predicate policyStartDatePredicate = cb.equal(policy.get("startDate"), date);
        cq.where(policyStartDatePredicate);

        TypedQuery<PolicyEntity> query = em.createQuery(cq);
        return query.getResultList();
    }

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
