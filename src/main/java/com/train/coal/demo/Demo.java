package com.train.coal.demo;


import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

public class Demo {
    public static void main(String[] args) {
        String i="11111";
        String pwd= DigestUtils.md5DigestAsHex(i.getBytes(StandardCharsets.UTF_8));
        System.out.println(pwd);
    }
}
