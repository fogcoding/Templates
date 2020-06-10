package com.fogcoding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/6/10 10:18
 * @e-mail: thinfog@126.com
 */

@SpringBootApplication
@MapperScan("com.fogcoding.mapper")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

}
