package com.spring.news.security;

import org.springframework.security.core.userdetails.User;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CustomUserDetails extends User {
    private final int userId;

    public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities, int userId) {
        super(username, password, authorities);
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }
}