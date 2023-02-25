package io.swagger.repository;

import io.swagger.entity.PolicyHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PolicyHolderRepository extends CrudRepository<PolicyHolder, Long> {
}
