package io.swagger.repository;

import io.swagger.entity.PolicyHolderEntity;
import org.springframework.data.repository.CrudRepository;

public interface PolicyHolderRepository extends CrudRepository<PolicyHolderEntity, Long> {
}
