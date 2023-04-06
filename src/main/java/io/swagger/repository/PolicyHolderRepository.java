package io.swagger.repository;

import io.swagger.entity.PolicyHolderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyHolderRepository extends CrudRepository<PolicyHolderEntity, Long> {
}
