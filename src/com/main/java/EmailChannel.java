package com.main.java;

import com.main.java.enums.ChannelType;

public class EmailChannel extends Channel{

    public EmailChannel() {
        super(ChannelType.EMAIL_CHANNEL);
    }

    @Override
    public void acceptRequest(MessageRequest messageRequest) {
        providerManager.get
    }

    
}
