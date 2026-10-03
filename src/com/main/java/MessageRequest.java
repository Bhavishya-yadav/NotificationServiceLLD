package com.main.java;

import com.main.java.enums.RequestType;

public class MessageRequest {
    private String message;
    private RequestType requestType;

    public MessageRequest(String message, RequestType requestType) {
        this.message = message;
        this.requestType = requestType;
    }

    public String getMessage() {
        return message;
    }

    public RequestType getRequestType() {
        return requestType;
    }
    
}
