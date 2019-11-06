package com.dkrcharlie.demo.springsecurity.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncoderUtil {

    public static String BCryptEncode(String original){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(original);
        return hashedPassword;
    }

}
