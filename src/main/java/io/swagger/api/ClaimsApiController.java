package io.swagger.api;

import io.swagger.entity.ClaimEntity;
import io.swagger.entity.PolicyEntity;
import io.swagger.model.Claim;
import io.swagger.model.Policy;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.processor.ClaimsProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-12T07:11:07.511Z")

@Controller
public class ClaimsApiController implements ClaimsApi {

    private static final Logger log = LoggerFactory.getLogger(ClaimsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private ClaimsProcessor claimsProcessor;

    @org.springframework.beans.factory.annotation.Autowired
    public ClaimsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public ResponseEntity<ClaimEntity> claimsClaimIdGet(@ApiParam(value = "The ID of the claim to retrieve",required=true) @PathVariable("claimId") String claimId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ClaimEntity claimRetrieved = claimsProcessor.processClaimGet(claimId);

                return new ResponseEntity<>(claimRetrieved, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClaimEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClaimEntity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Claim>> claimsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Claim>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Claim>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Claim>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> claimsPost(@ApiParam(value = "The claim to add" ,required=true )  @Valid @RequestBody Claim claim) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                Boolean claimAdded = claimsProcessor.processClaimAdd(claim);
                if(claimAdded) {
                    return new ResponseEntity<>("Policy Added successfully", HttpStatus.CREATED);
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
