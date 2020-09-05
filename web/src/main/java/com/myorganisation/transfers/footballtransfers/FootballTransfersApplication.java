package com.myorganisation.transfers.footballtransfers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FootballTransfersApplication {

    public static void main(String[] args) {
        SpringApplication.run(FootballTransfersApplication.class, args);
    }

}
