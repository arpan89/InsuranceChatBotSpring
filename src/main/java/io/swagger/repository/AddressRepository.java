package io.swagger.repository;

import io.swagger.entity.AddressEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {

    @Transactional
    @Modifying
    @Query("delete AddressEntity a where a.addressId = :addressId")
    public int deleteAddressByAddressId(@Param("addressId")Long addressId);
}
