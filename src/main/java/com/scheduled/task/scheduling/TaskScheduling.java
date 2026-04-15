package com.scheduled.task.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class TaskScheduling {
    private static final Logger logger =  LoggerFactory.getLogger(TaskScheduling.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        logger.info("This is time now {}",dateFormat.format(new Date()));
    }
}
