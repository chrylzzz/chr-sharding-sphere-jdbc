package com.chryl.chrshardingspherejdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chryl.dao")
public class ChrShardingSphereJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChrShardingSphereJdbcApplication.class, args);
    }

}
