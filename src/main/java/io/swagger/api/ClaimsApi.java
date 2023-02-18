/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.29).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Claim;
import io.swagger.model.Policy;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-12T07:11:07.511Z")

@Validated
@Api(value = "claims", description = "the claims API")
@RequestMapping(value = "/nichrome/InsuranceAPI/1.0.0")
public interface ClaimsApi {

    @ApiOperation(value = "Retrieve a list of claims", nickname = "claimsGet", notes = "Returns a list of all claims in the system", response = Claim.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of claims", response = Claim.class, responseContainer = "List") })
    @RequestMapping(value = "/claims",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Claim>> claimsGet();


    @ApiOperation(value = "Create a new claim", nickname = "claimsPost", notes = "Adds a new claim to the system", response = Policy.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The newly created policy", response = Policy.class) })
    @RequestMapping(value = "/claims",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Policy> claimsPost(@ApiParam(value = "The claim to add" ,required=true )  @Valid @RequestBody Claim claim);

}