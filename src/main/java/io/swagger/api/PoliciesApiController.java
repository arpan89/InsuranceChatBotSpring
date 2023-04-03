package io.swagger.api;

import io.swagger.entity.PolicyEntity;
import io.swagger.model.Policy;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.processor.PolicyProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-12T07:11:07.511Z")

@Controller
public class PoliciesApiController implements PoliciesApi {

    private static final Logger log = LoggerFactory.getLogger(PoliciesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private PolicyProcessor policyProcessor;

    @org.springframework.beans.factory.annotation.Autowired
    public PoliciesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Policy>> policiesGet(String startDate, String endDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                System.out.println("Inside Get Policies Request Method !!");
                List<PolicyEntity> policyEntities = policyProcessor.processListPolicyGet(startDate);
                System.out.println("PolicyEntities :: "+policyEntities.toString());
                String HealthPolicy = "healthPolicy";
                String SafteyPolicy = "safetyPolicy";
                return new ResponseEntity<List<Policy>>(objectMapper.readValue("[\n" +
                        "    {\n" +
                        "        \"policyId\": \"P001\",\n" +
                        "        \"name\": \"Health Insurance\",\n" +
                        "        \"detail\": \"Family Health Insurance\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"policyId\": \"P002\",\n" +
                        "        \"name\": \"Car Insurance\",\n" +
                        "        \"detail\": \"Tata Nexon Car Insurance\"\n" +
                        "    }\n" +
                        "]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Policy>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        System.out.println("End of Get Policies Request Method");

        return new ResponseEntity<List<Policy>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> policiesPolicyIdDelete(@ApiParam(value = "The ID of the policy to delete",required=true) @PathVariable("policyId") String policyId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    // Implemented and Unit Tested
    public ResponseEntity<PolicyEntity> policiesPolicyIdGet(@ApiParam(value = "The ID of the policy to retrieve",required=true) @PathVariable("policyId") String policyId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                PolicyEntity policyRetrieved = policyProcessor.processPolicyGet(policyId);

                    return new ResponseEntity<>(policyRetrieved, HttpStatus.OK);

                //return new ResponseEntity<Policy>(objectMapper.readValue("{\"empty\": false}", Policy.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PolicyEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PolicyEntity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Policy> policiesPolicyIdPut(@ApiParam(value = "The ID of the policy to update",required=true) @PathVariable("policyId") String policyId,@ApiParam(value = "The updated policy information" ,required=true )  @Valid @RequestBody Policy policy) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Policy>(objectMapper.readValue("{\"empty\": false}", Policy.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Policy>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Policy>(HttpStatus.NOT_IMPLEMENTED);
    }

    // Implemented and Unit Tested
    public ResponseEntity<String> policiesPost(@ApiParam(value = "The policy to add" ,required=true )  @Valid @RequestBody Policy policy) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                Boolean policyAdded = policyProcessor.processPolicyAdd(policy);
                if(policyAdded) {
                    return new ResponseEntity<>("Policy Added successfully", HttpStatus.CREATED);
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
