package io.swagger.repository;

import io.swagger.entity.PolicyEntity;
import org.springframework.data.repository.CrudRepository;

public interface PolicyRepository extends CrudRepository<PolicyEntity, Long> {
}
