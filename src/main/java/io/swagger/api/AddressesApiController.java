package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.entity.AddressEntity;
import io.swagger.entity.PolicyEntity;
import io.swagger.model.Address;
import io.swagger.model.Policy;
import io.swagger.processor.AddressProcessor;
import io.swagger.processor.PolicyProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-12T07:11:07.511Z")

@Controller
public class AddressesApiController implements AddressesApi {

    private static final Logger log = LoggerFactory.getLogger(AddressesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private AddressProcessor addressProcessor;

    @Autowired
    public AddressesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<AddressEntity>> addressesGet(@ApiParam(value = "The startDate of the policies to list",required=true) @PathVariable("startDate") String startDate,
                                                           @ApiParam(value = "The endDate of the policies to list",required=true) @PathVariable("endDate") String endDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                System.out.println("Inside Get Policies Request Method !!");
                List<AddressEntity> addressEntities = new ArrayList<>();//addressProcessor.processListPolicyGet(startDate);
                System.out.println("AddressEntities :: "+addressEntities.toString());
                return new ResponseEntity<List<AddressEntity>>(addressEntities, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AddressEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        System.out.println("End of Get Policies Request Method");

        return new ResponseEntity<List<AddressEntity>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> addressesAddressIdDelete(@ApiParam(value = "The ID of the address to delete",required=true) @PathVariable("addressId") String addressId) {
        String accept = request.getHeader("Accept");


        if (accept != null && accept.contains("application/json")) {
            try {
                int returnDelValue = 0;//addressProcessor.processAddressDelete(addressId);

                if(returnDelValue > 0)
                return new ResponseEntity<String>("Address Deleted Successfully", HttpStatus.OK);

            } catch (Exception e) {
                log.error("Some error occured in processing", e);
                return new ResponseEntity<String>("Some error occured in processing",HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    // Implemented and Unit Tested
    public ResponseEntity<AddressEntity> addressesAddressIdGet(@ApiParam(value = "The ID of the policy to retrieve",required=true) @PathVariable("policyId") String policyId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                AddressEntity addressRetrieved = new AddressEntity();//addressProcessor.processAddressGet(addressId);

                    return new ResponseEntity<>(addressRetrieved, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AddressEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AddressEntity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Address> addressesAddressIdPut(@ApiParam(value = "The ID of the address to update",required=true) @PathVariable("addressId") String addressId,@ApiParam(value = "The updated address information" ,required=true )  @Valid @RequestBody Address address) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Address>(objectMapper.readValue("{\"empty\": false}", Address.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Address>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Address>(HttpStatus.NOT_IMPLEMENTED);
    }

    // Implemented and Unit Tested
    public ResponseEntity<String> addressesPost(@ApiParam(value = "The address to add" ,required=true )  @Valid @RequestBody Address address) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                Boolean addressAdded = addressProcessor.processAddressAdd(address);
                if(addressAdded) {
                    return new ResponseEntity<>("Address Added successfully", HttpStatus.CREATED);
                }
                return new ResponseEntity<String>("Some error occured in processing",HttpStatus.INTERNAL_SERVER_ERROR);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>("",HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>("Issue in Accept Header",HttpStatus.NOT_IMPLEMENTED);
    }

}
