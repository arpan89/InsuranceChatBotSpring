package io.swagger.repository;

import io.swagger.entity.PolicyHolderEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PolicyHolderRepository extends CrudRepository<PolicyHolderEntity, Long> {

    @Transactional
    @Modifying
    @Query("delete PolicyHolderEntity ph where ph.policyHolderId = :policyHolderId")
    public int deletePolicyHolderByPolicyHolderId(@Param("policyHolderId")Long policyHolderId);
}
