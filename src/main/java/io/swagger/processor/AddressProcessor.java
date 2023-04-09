package io.swagger.processor;

import io.swagger.dao.AddressDao;
import io.swagger.entity.AddressEntity;
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
            addressService.addAddress(addressDao);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public AddressEntity processAddressGet(String addressId) {
        AddressEntity address = addressService.getAddress(addressId);
        if(address != null)
        System.out.println("Address Details :: "+address.toString());
        else System.out.println("No address found with provided addressId :: "+addressId);
        return address;
    }
}
