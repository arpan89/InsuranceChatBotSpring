package io.swagger.service;

import io.swagger.dao.ClaimDao;
import io.swagger.dao.PolicyDao;
import io.swagger.entity.ClaimEntity;
import io.swagger.entity.PolicyEntity;
import io.swagger.repository.ClaimRepository;
import io.swagger.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.threeten.bp.DateTimeUtils;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;

@Service
public class ClaimService {

    private ClaimRepository claimRepository;

    private EntityManager em;

    @Autowired
    public void ClaimService(EntityManager em) {
        this.em = em;
    }

    @Autowired
    public void ClaimService(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    public boolean addClaim(ClaimDao claimDao) {

        try {
            ClaimEntity claimEntity = new ClaimEntity();
            claimEntity.setClaimNumber(claimDao.getClaimNumber());
            claimEntity.setAmount(claimDao.getAmount());
            claimEntity.setDescription(claimDao.getDescription());
            claimEntity.setStatus(claimDao.getStatus());

            Date dateOfIncidentVar = DateTimeUtils.toSqlDate(claimDao.getDateOfIncident());
            System.out.println("Date of Incident Value :: "+dateOfIncidentVar.toString());
            System.out.println("Date of Incident Type :: "+ dateOfIncidentVar.getClass().getCanonicalName());

            claimEntity.setDateOfIncident(DateTimeUtils.toSqlDate(claimDao.getDateOfIncident()));
            claimEntity.setPolicyId(claimDao.getPolicyId());
            System.out.println("Claim Entity :: "+ claimEntity.toString());
            claimRepository.save(claimEntity);
            System.out.println("Executed Claim Repository");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ClaimEntity getClaim(String claimId) {
        ClaimEntity claimEntity = claimRepository.findOne(Long.valueOf(claimId));
        return claimEntity;
    }

}
