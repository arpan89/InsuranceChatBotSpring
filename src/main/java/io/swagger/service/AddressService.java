package io.swagger.service;

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

    private EntityManager em;

    @Autowired
    public AddressService(EntityManager em) {
        this.em = em;
    }
}
