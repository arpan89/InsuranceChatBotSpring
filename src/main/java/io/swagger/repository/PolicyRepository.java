package io.swagger.repository;

import io.swagger.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PolicyRepository extends CrudRepository<Policy, Long> {
}
