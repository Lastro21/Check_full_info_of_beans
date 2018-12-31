package com.example.demo.domain;

import org.springframework.stereotype.Component;

@Component
public class UserBeanOnStart {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
