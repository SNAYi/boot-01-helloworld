package com.org.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName user
 * @Description TODO
 * @Author snayi
 * @Date 2021/7/4 21:19
 * @Version 1.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String name;
    private Integer age;
    private Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
