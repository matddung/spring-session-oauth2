package com.study.OAuth2.oauth2;

import java.util.Map;

public class FacebookMemberInfo implements OAuth2MemberInfo{
    private Map<String, Object> attributes;
    @Override
    public String getProviderId() {
        return (String) attributes.get("id");
    }

    public FacebookMemberInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String getProvider() {
        return "facebook";
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }
}