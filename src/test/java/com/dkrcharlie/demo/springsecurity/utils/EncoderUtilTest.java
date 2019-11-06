package com.dkrcharlie.demo.springsecurity.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderUtilTest {

    @Test
    void BCryptEncode() {
        String encodedPassword = EncoderUtil.BCryptEncode("password");
        System.out.println(">>>>> encodedPassword = " + encodedPassword);
        assertNotNull(encodedPassword);
    }
}