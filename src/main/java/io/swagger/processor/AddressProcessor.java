package io.swagger.processor;

import io.swagger.dao.AddressDao;
import io.swagger.model.Address;
import io.swagger.repository.AddressRepository;
import io.swagger.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AddressProcessor {

    @Autowired
    private AddressService addressService;

    @Autowired
    private AddressRepository addressRepository;

    public boolean processAddressAdd(Address address) throws IOException {
        try{
            AddressDao addressDao = new AddressDao();
            addressDao.setCity(address.getCity());
            addressDao.setState(address.getState());
            addressDao.setZipCode(address.getZipCode());
            addressDao.setStreet(address.getStreet());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
