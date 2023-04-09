package io.swagger.processor;

import io.swagger.dao.PolicyDao;
import io.swagger.dao.PolicyHolderDao;
import io.swagger.entity.PolicyEntity;
import io.swagger.entity.PolicyHolderEntity;
import io.swagger.model.Policy;
import io.swagger.model.PolicyHolder;
import io.swagger.repository.PolicyHolderRepository;
import io.swagger.repository.PolicyRepository;
import io.swagger.service.PolicyHolderService;
import io.swagger.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@Component
public class PolicyHolderProcessor {

    @Autowired
    private PolicyHolderService policyHolderService;

    @Autowired
    private PolicyHolderRepository policyHolderRepository;

    public boolean processPolicyHolderAdd(PolicyHolder policyHolder) {
        try {
            PolicyHolderDao policyHolderDao = new PolicyHolderDao();
            policyHolderDao.setEmail(policyHolder.getEmail());
            policyHolderDao.setFirstName(policyHolder.getFirstName());
            policyHolderDao.setLastName(policyHolder.getLastName());
            policyHolderDao.setAddressId(Long.valueOf(policyHolder.getAddressId()));
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public PolicyHolderEntity processPolicyHolderGet(String policyHolderId) {
        PolicyHolderEntity policyHolderEntity = policyHolderService.getPolicyHolder(policyHolderId);
        if(policyHolderEntity != null) {
            System.out.println("Policy Holder Details :: "+policyHolderEntity.toString());
        } else System.out.println("No policy holder found with provided policyHolderId"+policyHolderId);
        return policyHolderEntity;
    }

    public int processPolicyHolderDelete (String policyHolderId) {
        int returnDelValue = policyHolderRepository.deletePolicyHolderByPolicyHolderId(Long.valueOf(policyHolderId));
        return returnDelValue;
    }

}
