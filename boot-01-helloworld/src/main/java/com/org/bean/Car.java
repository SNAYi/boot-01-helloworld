package com.org.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: SNAYi
 * @Date: 2021/7/6 12:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Double price;
}
