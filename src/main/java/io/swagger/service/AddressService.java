package io.swagger.service;

import io.swagger.dao.AddressDao;
import io.swagger.entity.AddressEntity;
import io.swagger.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class AddressService {

    private AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Autowired
    private EntityManager em;

    //@Autowired
    //public AddressService(EntityManager em) {
        //this.em = em;
    //}

    public boolean addAddress(AddressDao addressDao) {
        try{
            AddressEntity addressEntity = new AddressEntity();
            addressEntity.setCity(addressDao.getCity());
            addressEntity.setState(addressDao.getState());
            addressEntity.setStreet(addressDao.getStreet());
            addressEntity.setZipCode(addressDao.getZipCode());
            addressRepository.save(addressEntity);
            System.out.println("Executed Address Repository");
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public AddressEntity getAddress(String addressId) {
        AddressEntity addressEntity = addressRepository.findOne(Long.valueOf(addressId));
        return addressEntity;
    }
}
