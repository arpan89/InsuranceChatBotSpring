package io.swagger.repository;

import io.swagger.entity.ClaimEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends CrudRepository<ClaimEntity, Long> {
}
