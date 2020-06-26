package com.yangxuan.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.yangxuan.backup")
public class BackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackupApplication.class, args);
    }

}
