/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.29).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.entity.AddressEntity;
import io.swagger.model.Address;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-12T07:11:07.511Z")

@Validated
@Api(value = "address", description = "the address API")
@RequestMapping(value = "/insuranceapi")
public interface AddressesApi {

    @ApiOperation(value = "Retrieve a list of addresses", nickname = "addressesGet", notes = "Returns a list of all addresses in the system", response = AddressEntity.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of addresses", response = Address.class, responseContainer = "List") })
    @RequestMapping(value = "/addresses/{startDate}/{endDate}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<AddressEntity>> addressesGet(@ApiParam(value = "The startDate of the address to list",required=true) @PathVariable("startDate") String startDate,
                                             @ApiParam(value = "The endDate of the address to list",required=true) @PathVariable("endDate") String endDate);


    @ApiOperation(value = "Delete an address", nickname = "addressIdDelete", notes = "Deletes the address with the specified ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The address has been deleted") })
    @RequestMapping(value = "/addresses/{addressId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<String> addressesAddressIdDelete(@ApiParam(value = "The ID of the address to delete",required=true) @PathVariable("addressId") String addressId);


    @ApiOperation(value = "Retrieve a address by ID", nickname = "addressesAddressIdGet", notes = "Returns the address with the specified ID", response = Address.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The address with the specified ID", response = Address.class) })
    @RequestMapping(value = "/addresses/{addressId}",
        produces = { "*/*" },
        consumes = { "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<String> addressesAddressIdGet(@ApiParam(value = "The ID of the address to retrieve",required=true) @PathVariable("addressId") String addressId);


    @ApiOperation(value = "Update a policy", nickname = "addressesAddressIdPut", notes = "Updates the address with the specified ID", response = Address.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated address", response = Address.class) })
    @RequestMapping(value = "/addresses/{addressId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Address> addressesAddressIdPut(@ApiParam(value = "The ID of the address to update",required=true) @PathVariable("addressId") String addressId,@ApiParam(value = "The updated address information" ,required=true )  @Valid @RequestBody Address address);


    @ApiOperation(value = "Create a new address", nickname = "addressesPost", notes = "Adds a new address to the system", response = Address.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The newly created address", response = Address.class) })
    @RequestMapping(value = "/addresses",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<String> addressesPost(@ApiParam(value = "The address to add" ,required=true )  @Valid @RequestBody Address address);

}
