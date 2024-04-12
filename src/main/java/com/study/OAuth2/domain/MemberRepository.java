package com.study.OAuth2.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByOauth2Id(String oauth2Id);
    Optional<Member> findByName(String username);
}