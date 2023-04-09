package io.swagger.processor;

import io.swagger.dao.PolicyDao;
import io.swagger.entity.PolicyEntity;
import io.swagger.model.Policy;
import io.swagger.repository.PolicyRepository;
import io.swagger.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@Component
public class PolicyProcessor {

    @Autowired
    private PolicyService policyService;

    @Autowired
    private PolicyRepository policyRepository;

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

    public PolicyEntity processPolicyGet(String policyId) throws IOException {
        PolicyEntity policy = policyService.getPolicy(policyId);
        if(policy != null)
        System.out.println("Policy Details :: "+policy.toString());
        else System.out.println("No policy found with provided policyId"+policyId);
        return policy;
    }

    public List<PolicyEntity> processListPolicyGet(String startDate) throws IOException, ParseException {

        List<PolicyEntity> listPolicy = policyService.getListPolicy(startDate);
        return listPolicy;
    }

    public int processPolicyDelete(String policyId) {

        int returnDelValue = policyRepository.deletePolicyByPolicyId(Long.valueOf(policyId));

        return returnDelValue;
    }
}
