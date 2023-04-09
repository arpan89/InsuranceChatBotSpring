package io.swagger.processor;

import io.swagger.dao.PolicyDao;
import io.swagger.entity.PolicyEntity;
import io.swagger.model.Policy;
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


}
