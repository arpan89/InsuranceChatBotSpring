package io.swagger.service;

import io.swagger.dao.PolicyDao;
import io.swagger.entity.PolicyEntity;
import io.swagger.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.threeten.bp.DateTimeUtils;

@Service
public class PolicyService {

    private PolicyRepository policyRepository;

    @Autowired
    public void PolicyService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    public boolean addPolicy(PolicyDao policyDao) {

        try {
            PolicyEntity policyEntity = new PolicyEntity();
            policyEntity.setPolicyHolderId(policyDao.getPolicyHolderId());
            policyEntity.setPolicyNumber(policyDao.getPolicyNumber());
            policyEntity.setEndDate(DateTimeUtils.toSqlDate(policyDao.getEndDate()));
            policyEntity.setStartDate(DateTimeUtils.toSqlDate(policyDao.getStartDate()));
            policyEntity.setPremiumAmount(policyDao.getPremiumAmount());
            System.out.println("Policy Entity :: "+ policyEntity.toString());
            policyRepository.save(policyEntity);
            System.out.println("Executed Policy Repository");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
