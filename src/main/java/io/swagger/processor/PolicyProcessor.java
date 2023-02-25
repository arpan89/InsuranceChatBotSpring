package io.swagger.processor;

import io.swagger.dao.PolicyDao;
import io.swagger.model.Policy;
import io.swagger.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class PolicyProcessor {

    @Autowired
    private PolicyService policyService;

    public boolean processPolicyAdd(Policy policy) throws IOException {
        try{
            PolicyDao policyDao = new PolicyDao();
            policyDao.setPolicyNumber(policy.getPolicyNumber());
            policyDao.setPolicyHolderId(Long.valueOf(policy.getId()));
            policyDao.setPremiumAmount(policy.getPremiumAmount());
            policyDao.setStartDate(policy.getStartDate());
            policyDao.setEndDate(policy.getEndDate());
            policyService.addPolicy(policyDao);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
