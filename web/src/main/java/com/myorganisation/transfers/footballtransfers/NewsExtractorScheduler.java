package com.myorganisation.transfers.footballtransfers;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class NewsExtractorScheduler {

    @Scheduled(fixedRate = 5000)
    public void extractTransferNews(){
        System.out.println("This method is being called at " + new Date().toString());
    }
}
