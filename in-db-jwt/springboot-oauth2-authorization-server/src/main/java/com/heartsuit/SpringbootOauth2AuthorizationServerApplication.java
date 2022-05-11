package com.heartsuit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringbootOauth2AuthorizationServerApplication {

    public static void main(String[] args) {
        testPassword("secret1");
        SpringApplication.run(SpringbootOauth2AuthorizationServerApplication.class, args);
    }

    private static void testPassword(String password) {
        BCryptPasswordEncoder bcryptObj =  new BCryptPasswordEncoder();
        System.out.println("password : " + password + " => " + bcryptObj.encode(password));
    }

}
