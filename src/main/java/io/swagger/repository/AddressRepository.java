package io.swagger.repository;

import io.swagger.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
