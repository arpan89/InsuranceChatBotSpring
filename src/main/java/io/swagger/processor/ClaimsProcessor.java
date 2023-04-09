package io.swagger.processor;

import io.swagger.dao.ClaimDao;
import io.swagger.dao.PolicyDao;
import io.swagger.entity.ClaimEntity;
import io.swagger.entity.PolicyEntity;
import io.swagger.model.Claim;
import io.swagger.model.Policy;
import io.swagger.repository.ClaimRepository;
import io.swagger.repository.PolicyRepository;
import io.swagger.service.ClaimService;
import io.swagger.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@Component
public class ClaimsProcessor {

    @Autowired
    private ClaimService claimService;

    @Autowired
    private ClaimRepository claimRepository;

    public boolean processClaimAdd(Claim claim) throws IOException {
        try{
            ClaimDao claimDao = new ClaimDao();
            claimDao.setClaimNumber(claim.getClaimNumber());
            claimDao.setAmount(claim.getAmount());
            claimDao.setDescription(claim.getDescription());
            claimDao.setStatus(claim.getStatus());
            claimDao.setPolicyId(claim.getPolicyId());
            claimDao.setDateOfIncident(claim.getDateOfIncident());
            claimService.addClaim(claimDao);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ClaimEntity processClaimGet(String claimId) {
        ClaimEntity claim = claimService.getClaim(claimId);
        if(claim != null) System.out.println("Claim detials :: "+claim.toString());
        else System.out.println("No claim found with provided claimId :: "+claimId);
        return claim;
    }
}
