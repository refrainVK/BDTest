package com.hello.springboot.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:User.properties")
@Component
public class User {
    // @Value("X")
    @Value(value = "${User.name}")
    String name;
    @Value("${User.age}")
    int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}