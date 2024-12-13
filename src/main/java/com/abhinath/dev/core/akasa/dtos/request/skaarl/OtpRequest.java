package com.abhinath.dev.core.akasa.dtos.request.skaarl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)   
@JsonTypeName("otp-request") 
public class OtpRequest extends SkaarlBaseRequest {
    private String otp;
    

    public static void main(String[] args) throws JsonProcessingException {
        String json = """
                {
                    "body": {
                        "AccessToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6IjUyNjU2ODY5Iiwicm9sZSI6IjI0ODY5IiwiU3RhdGUiOiIiLCJSZWRpcmVjdFNlcnZlciI6IkIiLCJuYmYiOjE3MzM4MzM1MjIsImV4cCI6MTczMzg1NTM5OSwiaWF0IjoxNzMzODMzNTIyfQ.zPynm8_6jz_GoU6bgk8xx9Q5Ph4D0E5rYbZjKbJnrnA",
                        "AllowBseCash": "Y",
                        "AllowBseDeriv": "Y",
                        "AllowBseMF": "Y",
                        "AllowMCXComm": "Y",
                        "AllowMcxSx": "N",
                        "AllowNSECurrency": "Y",
                        "AllowNSEL": "Y",
                        "AllowNseCash": "Y",
                        "AllowNseComm": "N",
                        "AllowNseDeriv": "Y",
                        "AllowNseMF": "N",
                        "BulkOrderAllowed": 0,
                        "CleareDt": "/Date(1733801400000+0530)/",
                        "ClientCode": "52656869",
                        "ClientName": "ABHINATH",
                        "ClientType": "1",
                        "CommodityEnabled": "Y",
                        "CustomerType": "OPTIMUM",
                        "DPInfoAvailable": "Y",
                        "DemoTrial": "N",
                        "DirectMFCharges": 0,
                        "IsIDBound": 0,
                        "IsIDBound2": 0,
                        "IsOnlyMF": "N",
                        "IsPLM": 0,
                        "IsPLMDefined": 0,
                        "Message": "Success",
                        "OTPCredentialID": "",
                        "PGCharges": 10,
                        "PLMsAllowed": 0,
                        "POAStatus": "N",
                        "PasswordChangeFlag": 0,
                        "PasswordChangeMessage": "",
                        "ReferralBenefits": 0,
                        "RefreshToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6IjUyNjU2ODY5Iiwicm9sZSI6IjI0ODY5IiwiU3RhdGUiOiIiLCJSZWRpcmVjdFNlcnZlciI6IkIiLCJuYmYiOjE3MzM4MzM1MjIsImV4cCI6MTc0MTU0NTAwMCwiaWF0IjoxNzMzODMzNTIyfQ.smmGNcVxaUdsf9rETyJeYDs2n2n3JlDkruWCR1fvUJk",
                        "RunningAuthorization": 0,
                        "Status": 0,
                        "VersionChanged": 0
                    },
                    "head": {
                        "Status": 0,
                        "StatusDescription": "Success"
                    }
                }""";

        ObjectMapper objectMapper = new ObjectMapper();
      
        LoginResponse otpRequest = objectMapper.readValue(json, LoginResponse.class);
        System.out.println(otpRequest);
       
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LoginResponse {
        private String otp;
        
        @JsonProperty("body")
        private OtpRequestBody body;
        
        @JsonProperty("head")
        private RequestHead head;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OtpRequestBody {
        private String AccessToken;
        private String AllowBseCash;
        private String AllowBseDeriv;
        private String AllowBseMF;
        private String AllowMCXComm;
        private String AllowMcxSx;
        private String AllowNSECurrency;
        private String AllowNSEL;
        private String AllowNseCash;
        private String AllowNseComm;
        private String AllowNseDeriv;
        private String AllowNseMF;
        private Integer BulkOrderAllowed;
        private String CleareDt;
        private String ClientCode;
        private String ClientName;
        private String ClientType;
        private String RefreshToken;
        // ... add other fields as needed
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RequestHead {
        private Integer Status;
        private String StatusDescription;
    }
}


