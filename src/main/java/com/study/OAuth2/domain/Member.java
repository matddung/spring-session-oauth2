package com.study.OAuth2.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //기본키
    private String oauth2Id; //식별자
    private String name; //유저 이름
    private String password; //유저 비밀번호
    private String role; //유저 권한 (일반 유저, 관리자)
    private String provider; //공급자 (google, facebook ...)
    private String providerId; //공급 아이디

    @Builder
    public Member(String oauth2Id, String name, String password, String role, String provider, String providerId) {
        this.oauth2Id=oauth2Id;
        this.name = name;
        this.password = password;
        this.role = role;
        this.provider = provider;
        this.providerId = providerId;
    }
}