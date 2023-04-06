package io.swagger.repository;

import io.swagger.entity.PolicyEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;

@Repository
public interface PolicyRepository extends CrudRepository<PolicyEntity, Long> {

    @Transactional
    @Modifying
    @Query("delete PolicyEntity p where p.policyId = :policyId")
    public int deletePolicyByPolicyId(@Param("policyId")Long policyId);
}
