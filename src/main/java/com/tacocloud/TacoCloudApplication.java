package com.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * BootStrapping TacoCloudApplication
 * @SpringBootApplication::
 *                          @SpringBootConfiguration -> special form of @Configuration(Add any java based configuration)
 *                          @EnableAutoConfiguration
 *                          @ComponentScan - This lets you declare other classes with annotations - @Controller, @Service, @Component
 *                          to have spring automatically discover them and register them in spring application context.
 * SpringApplication.run - BootStraps the class and creates spring application context.
 *
 */
@SpringBootApplication (scanBasePackages= {"com.tacocloud.home",
        "com.tacocloud"})
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}

