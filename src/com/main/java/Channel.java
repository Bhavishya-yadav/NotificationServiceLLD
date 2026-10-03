package com.main.java;

import com.main.java.enums.ChannelType;

public abstract class Channel {
    private ChannelType type;
    private ProviderManager providerManager;

    public Channel(ChannelType type) {
        this.type = type;
        this.providerManager = ProviderManager.getInstance();
    }

    public abstract void acceptRequest(MessageRequest messageRequest);
    
}
/*
Req -> EmailRequest
Channelfactory -> Channel
Channel -> this is the request
Provider 

*/
