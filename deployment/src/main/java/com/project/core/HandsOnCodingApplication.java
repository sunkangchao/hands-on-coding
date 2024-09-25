package com.project.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * HandsOnCodingApplication
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 23, 2024</pre>
 */
@MapperScan("com.project.core.kernel.mysql")
@SpringBootApplication
public class HandsOnCodingApplication {


    public static void main(String[] args) {
        SpringApplication.run(HandsOnCodingApplication.class, args);
    }

}
