package com.atguigu.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName: DockerBootApplication
 * @Description
 * @Author:我自己
 * @Date: 2022/8/6  16:14
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.atguigu.docker.mapper") //import tk.mybatis.spring.annotation.MapperScan;
public class DockerBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerBootApplication.class,args);
    }
}
