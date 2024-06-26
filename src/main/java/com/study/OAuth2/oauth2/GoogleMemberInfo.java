package com.study.OAuth2.oauth2;

import java.util.Map;

public class GoogleMemberInfo implements OAuth2MemberInfo{
    public GoogleMemberInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    private Map<String, Object> attributes;
    @Override
    public String getProviderId() {
        return (String) attributes.get("sub");
    }

    @Override
    public String getProvider() {
        return "google";
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }
}