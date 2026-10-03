package com.main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.main.java.enums.ChannelType;

public class ProviderManager {
    private Map<ChannelType, List<Provider>> channelTypeToProvidersMap;
    private static ProviderManager instance;

    private ProviderManager() {
        channelTypeToProvidersMap = new HashMap<>();
    }

    public synchronized static ProviderManager getInstance() {
        if(instance == null)
            instance = new ProviderManager();
        return instance;
    }

    public void addProvider(Provider provider) {
        if(provider == null || provider.getSupportedChannels() == null || provider.getSupportedChannels().isEmpty()) {
            System.out.println("Incorrect provider!!!");
            return;
        }
        provider.getSupportedChannels().forEach(channel -> {
            channelTypeToProvidersMap.putIfAbsent(channel, new ArrayList<>());
            channelTypeToProvidersMap.get(channel).add(provider);
        });
    }

    public List<Provider> getProvidersForChannelType(ChannelType channelType) {
        return channelTypeToProvidersMap.getOrDefault(channelType, new ArrayList<>());
    }
}
