package com.ihomziak.bankingapp.api.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BankingAppAccountManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingAppAccountManagementApplication.class, args);
    }

}
