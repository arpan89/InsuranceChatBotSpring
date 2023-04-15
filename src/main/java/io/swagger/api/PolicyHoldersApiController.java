package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.entity.PolicyEntity;
import io.swagger.entity.PolicyHolderEntity;
import io.swagger.model.Policy;
import io.swagger.model.PolicyHolder;
import io.swagger.processor.PolicyHolderProcessor;
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
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-12T07:11:07.511Z")

@Controller
public class PolicyHoldersApiController implements PolicyHoldersApi {

    private static final Logger log = LoggerFactory.getLogger(PolicyHoldersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private PolicyHolderProcessor policyHolderProcessor;

    @Autowired
    public PolicyHoldersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<PolicyHolderEntity>> policyHoldersGet(@ApiParam(value = "The firstName of the policyHolders to list",required=true) @PathVariable("firstName") String firstName,
                                                                     @ApiParam(value = "The lastName of the policyHolders to list",required=true) @PathVariable("lastName") String lastName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                System.out.println("Inside Get Policy Holders Request Method !!");
                List<PolicyHolderEntity> policyEntities = null;//policyHolderProcessor.processListPolicyGet(startDate);
                if(policyEntities != null)
                System.out.println("PolicyEntities :: "+policyEntities.toString());
                return new ResponseEntity<List<PolicyHolderEntity>>(policyEntities, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PolicyHolderEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        System.out.println("End of Get Policy Holders Request Method");

        return new ResponseEntity<List<PolicyHolderEntity>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> policyHoldersPolicyHolderIdDelete(@ApiParam(value = "The ID of the policyHolder to delete",required=true) @PathVariable("policyHolderId") String policyHolderId) {
        String accept = request.getHeader("Accept");


        if (accept != null && accept.contains("application/json")) {
            try {
                int returnDelValue = policyHolderProcessor.processPolicyHolderDelete(policyHolderId);

                if(returnDelValue > 0)
                return new ResponseEntity<String>("PolicyHolder Deleted Successfully", HttpStatus.OK);

            } catch (Exception e) {
                log.error("Some error occured in processing", e);
                return new ResponseEntity<String>("Some error occured in processing",HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    // Implemented and Unit Tested
    public ResponseEntity<String> policyHoldersPolicyHolderIdGet(@ApiParam(value = "The ID of the policyHolder to retrieve",required=true) @PathVariable("policyHolderId") String policyHolderId) {
        //String accept = request.getHeader("Accept");
        //if (accept != null && accept.contains("application/json")) {
            try {
                PolicyHolderEntity policyRetrieved = policyHolderProcessor.processPolicyHolderGet(policyHolderId);

                    return new ResponseEntity<String>(policyRetrieved.toString(), HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        //}

        //return new ResponseEntity<PolicyHolderEntity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PolicyHolder> policyHoldersPolicyHolderIdPut(@ApiParam(value = "The ID of the policyHolder to update",required=true) @PathVariable("policyHolderId") String policyHolderId,@ApiParam(value = "The updated policyHolder information" ,required=true )  @Valid @RequestBody PolicyHolder policyHolder) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PolicyHolder>(objectMapper.readValue("{\"empty\": false}", PolicyHolder.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PolicyHolder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PolicyHolder>(HttpStatus.NOT_IMPLEMENTED);
    }

    // Implemented and Unit Tested
    public ResponseEntity<String> policyHoldersPost(@ApiParam(value = "The policyHolder to add" ,required=true )  @Valid @RequestBody PolicyHolder policyHolder) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                Boolean policyHolderAdded = policyHolderProcessor.processPolicyHolderAdd(policyHolder);
                if(policyHolderAdded) {
                    return new ResponseEntity<>("Policy Holder Added successfully", HttpStatus.CREATED);
                }
                return new ResponseEntity<String>("Some error occured in processing",HttpStatus.INTERNAL_SERVER_ERROR);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>("",HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>("Issue in Accept Header",HttpStatus.NOT_IMPLEMENTED);
    }

}
