package com.wcl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableTransactionManagement
@SpringBootApplication
public class LoginDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginDemoApplication.class, args);
    }

    @RequestMapping("/123")
    public String hello() {
        return "hello spring boot!";
    }


}
