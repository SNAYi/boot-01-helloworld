package com.org.config;

import ch.qos.logback.core.db.DBHelper;
import com.org.bean.Car;
import com.org.bean.Pet;
import com.org.bean.User;
import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName MyConfig
 * @Description TODO
 * @Author snayi
 * @Date 2021/7/4 21:34
 * @Version 1.0
 **/
@Data
//表示当前类是个配置类
@Configuration(proxyBeanMethods = false)
//给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
@Import({User.class, DBHelper.class})
//条件装配
@ConditionalOnMissingBean(name = "user02")
//原生配置文件引入
@ImportResource("classpath:bean.xml")
@EnableConfigurationProperties(Car.class)
public class MyConfig {
    //给IOC容器中添加组件
    @Bean
    public User user01(){
        User user = new User("张三", 100);
        /*user.setPet(tomcatPet());*/
        return user;

    }
    @Bean("TMD")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}
