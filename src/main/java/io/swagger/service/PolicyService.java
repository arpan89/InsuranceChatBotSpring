package io.swagger.service;

import io.swagger.dao.PolicyDao;
import io.swagger.entity.Policy;
import io.swagger.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    private Policy policyEntity;
    private PolicyRepository policyRepository;

    @Autowired
    public void PolicyService(Policy policyEntity){
        this.policyEntity = policyEntity;
    }

    @Autowired
    public void PolicyService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    public boolean addPolicy(PolicyDao policyDao) {

        try {
            policyEntity.setPolicyHolderId(policyDao.getPolicyHolderId());
            policyEntity.setPolicyNumber(policyDao.getPolicyNumber());
            policyEntity.setEndDate(policyDao.getEndDate());
            policyEntity.setStartDate(policyDao.getStartDate());
            policyEntity.setPremiumAmount(policyDao.getPremiumAmount());
            policyRepository.save(policyEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
