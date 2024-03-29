/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.29).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.entity.PolicyEntity;
import io.swagger.entity.PolicyHolderEntity;
import io.swagger.model.Policy;
import io.swagger.model.PolicyHolder;
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
@Api(value = "policyHolders", description = "the policyHolders API")
@RequestMapping(value = "/insuranceapi")
public interface PolicyHoldersApi {

    @ApiOperation(value = "Retrieve a list of policyHolders", nickname = "policyHoldersGet", notes = "Returns a list of all policyHolders in the system", response = PolicyHolderEntity.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of policyHolders", response = PolicyHolder.class, responseContainer = "List") })
    @RequestMapping(value = "/policyHolders/{firstName}/{lastName}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<PolicyHolderEntity>> policyHoldersGet(@ApiParam(value = "The firstName of the policyHolders to list",required=true) @PathVariable("firstName") String firstName,
                                             @ApiParam(value = "The lastName of the policyHolders to list",required=true) @PathVariable("lastName") String lastName);


    @ApiOperation(value = "Delete a policyHolder", nickname = "policyHoldersPolicyHolderIdDelete", notes = "Deletes the policyHolder with the specified ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The policyHolder has been deleted") })
    @RequestMapping(value = "/policyHolders/{policyHolderId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<String> policyHoldersPolicyHolderIdDelete(@ApiParam(value = "The ID of the policyHolder to delete",required=true) @PathVariable("policyHolderId") String policyHolderId);


    @ApiOperation(value = "Retrieve a policyHolder by ID", nickname = "policyHoldersPolicyHolderIdGet", notes = "Returns the policyHolder with the specified ID", response = PolicyHolder.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The policyHolder with the specified ID", response = PolicyHolder.class) })
    @RequestMapping(value = "/policyHolders/{policyHolderId}",
        produces = { "*/*" },
        consumes = { "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<String> policyHoldersPolicyHolderIdGet(@ApiParam(value = "The ID of the policyHolder to retrieve",required=true) @PathVariable("policyHolderId") String policyHolderId);


    @ApiOperation(value = "Update a policyHolder", nickname = "policyHoldersPolicyHolderIdPut", notes = "Updates the policyHolder with the specified ID", response = PolicyHolder.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated policyHolder", response = PolicyHolder.class) })
    @RequestMapping(value = "/policyHolders/{policyHolderId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<PolicyHolder> policyHoldersPolicyHolderIdPut(@ApiParam(value = "The ID of the policyHolder to update",required=true) @PathVariable("policyHolderId") String policyHolderId,@ApiParam(value = "The updated policyHolder information" ,required=true )  @Valid @RequestBody PolicyHolder policyHolder);


    @ApiOperation(value = "Create a new policyHolder", nickname = "policyHoldersPost", notes = "Adds a new policyHolder to the system", response = PolicyHolder.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The newly created policyHolder", response = PolicyHolder.class) })
    @RequestMapping(value = "/policyHolders",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<String> policyHoldersPost(@ApiParam(value = "The policyHolder to add" ,required=true )  @Valid @RequestBody PolicyHolder policyHolder);

}
