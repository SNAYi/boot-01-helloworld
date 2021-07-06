package com.org;

import ch.qos.logback.core.db.DBHelper;
import com.org.bean.Pet;
import com.org.bean.User;
import com.org.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 * 主程序类
 * @SpringBootApplication: 这是一个springboot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(MainApplication.class, args);
/*        // 返回一个IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //查看容器里的组件
        for(String name:run.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        //从容器中获取组件
        Pet tmd1 = run.getBean("TMD", Pet.class);
        Pet tmd2 = run.getBean("TMD", Pet.class);
        Pet tmd3 = run.getBean("TMD", Pet.class);
        System.out.println(tmd1==tmd2);

        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);
        User user01 = bean.user01();
        Pet tomcatPet = bean.tomcatPet();
        System.out.println(user01.getPet() == tomcatPet);
        for (String s : run.getBeanNamesForType(User.class)) {
            System.out.println(s);
        }
        System.out.println(run.getBean(DBHelper.class));
        boolean haha = run.containsBean("haha");
        System.out.println("有容器haha:"+haha);
        boolean hehe = run.containsBean("hehe");
        System.out.println("有容器hehe:"+hehe);

        boolean user01 = run.containsBean("user01");
        System.out.println("有容器user01:"+user01);
        boolean pet = run.containsBean("TMD");
        System.out.println("有容器pet:"+pet);
    }*/
/*        Properties pps = new Properties();
        pps.load(new FileInputStream("application.properties"));*/
    }
}
