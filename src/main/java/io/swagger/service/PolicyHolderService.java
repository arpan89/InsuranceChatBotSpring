package io.swagger.service;

import io.swagger.dao.PolicyDao;
import io.swagger.entity.PolicyEntity;
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


}
