package io.swagger.service;

import io.swagger.dao.PolicyDao;
import io.swagger.dao.PolicyHolderDao;
import io.swagger.entity.PolicyEntity;
import io.swagger.entity.PolicyHolderEntity;
import io.swagger.repository.PolicyHolderRepository;
import io.swagger.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.threeten.bp.DateTimeUtils;

import javax.persistence.EntityManager;
import java.text.ParseException;
import java.util.List;

@Service
public class PolicyHolderService {

    private PolicyHolderRepository policyHolderRepository;

    private EntityManager em;

    @Autowired
    public void PolicyHolderService(EntityManager em) {
        this.em = em;
    }

    @Autowired
    public void PolicyHolderService(PolicyHolderRepository policyHolderRepository) {
        this.policyHolderRepository = policyHolderRepository;
    }

    public boolean addPolicyHolder(PolicyHolderDao policyHolderDao) {
        try {
            PolicyHolderEntity policyHolderEntity = new PolicyHolderEntity();
            policyHolderEntity.setAddressId(policyHolderDao.getAddressId());
            policyHolderEntity.setEmail(policyHolderDao.getEmail());
            policyHolderEntity.setFirstName(policyHolderDao.getFirstName());
            policyHolderEntity.setLastName(policyHolderDao.getLastName());
            System.out.println("Policy Holder Entity :: "+policyHolderEntity.toString());
            policyHolderRepository.save(policyHolderEntity);
            System.out.println("Executed Policy Holder Repository");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public PolicyHolderEntity getPolicyHolder(String policyHolderId) {
        PolicyHolderEntity policyHolderEntity = policyHolderRepository.findOne(Long.valueOf(policyHolderId));
        return policyHolderEntity;
    }

}
