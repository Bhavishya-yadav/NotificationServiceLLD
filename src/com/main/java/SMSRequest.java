package com.main.java;

import com.main.java.enums.RequestType;

public class SMSRequest extends MessageRequest{
    private String mobileNumber;

    public SMSRequest(String message, RequestType requestType, String mobileNumber) {
        super(message, requestType);
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
    
}
