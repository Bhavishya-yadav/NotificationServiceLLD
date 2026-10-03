package com.main.java;
import java.util.Set;
import com.main.java.enums.ChannelType;

public class Provider {
    private String providerId;
    private String name;
    private Set<ChannelType> supportedChannels;

    public Provider(String providerId, String name, Set<ChannelType> supportedChannels) {
        this.name = name;
        this.providerId = providerId;
        this.supportedChannels = supportedChannels;
    }

    public String getProviderId() {
        return providerId;
    }

    public String getName() {
        return name;
    }

    public Set<ChannelType> getSupportedChannels() {
        return supportedChannels;
    }

    public void addChannel(ChannelType channelType) {
        supportedChannels.add(channelType);
    }

}
