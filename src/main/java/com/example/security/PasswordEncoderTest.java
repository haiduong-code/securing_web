package com.example.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {
    public static void main(String[] args) {
        String rawPassword = "password";
        String encodedPassword = new BCryptPasswordEncoder().encode(rawPassword);
        System.out.println(encodedPassword);
    }
}
