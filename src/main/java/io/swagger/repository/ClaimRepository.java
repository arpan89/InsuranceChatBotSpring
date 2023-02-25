package io.swagger.repository;

import io.swagger.entity.ClaimEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClaimRepository extends CrudRepository<ClaimEntity, Long> {
}
