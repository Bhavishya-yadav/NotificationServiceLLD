package com.main.java;

import com.main.java.enums.RequestType;

public class EmailRequest extends MessageRequest{

    private String senderEmail;
    private String receiverEmail;
    private String subject;

    public EmailRequest(String message, RequestType requestType, String senderEmail, String receiverEmail, String subject) {
        super(message, requestType);
        this.receiverEmail = receiverEmail;
        this.senderEmail = senderEmail;
        this.subject = subject;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public String getSubject() {
        return subject;
    }
    
}
