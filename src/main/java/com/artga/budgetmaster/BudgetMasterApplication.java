package com.artga.budgetmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class BudgetMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgetMasterApplication.class, args);
    }

}
