package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MySqlQueryPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySqlQueryPracticeApplication.class, args);
	}
    /*@Scheduled(cron ="* * * * * TUE")
    public void cronTestMethod(){
        logger.info("method called with time with cron interval : {}",new Date());
        System.out.println("------------------------------------------------");
    }

    @Scheduled(fixedDelay = 2000)
    public void fixedDelayTesting(){
        logger.info("method called with fixed delay : {}", new Date());
        System.out.println("------------------------------------------------");
    }

    @Scheduled(fixedRate = 1000)
    public void fixedRateTesting(){
        logger.info("method using fixed rate testing : {}", new Date());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
    }*/
}
