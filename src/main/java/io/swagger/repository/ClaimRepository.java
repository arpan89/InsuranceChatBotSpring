package io.swagger.repository;

import io.swagger.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ClaimRepository extends CrudRepository<Claim, Long> {
}
