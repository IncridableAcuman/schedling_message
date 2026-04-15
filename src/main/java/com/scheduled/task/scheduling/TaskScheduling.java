package com.scheduled.task.scheduling;

import com.scheduled.task.util.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class TaskScheduling {
    @Value("${client.name}")
    private String clientName;
    private static final Logger logger =  LoggerFactory.getLogger(TaskScheduling.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private final MessageUtil messageUtil;

    public TaskScheduling(MessageUtil messageUtil){
        this.messageUtil=messageUtil;
    }

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        logger.info("This is now {}",dateFormat.format(new Date()));
    }


    @Scheduled(fixedDelay = 5000)
    public void sendMessage(){
        messageUtil.sendMail(clientName,"Hello World","https://incridable-acuman.vercel.app/");
        logger.info("Message successfully sent");
    }
}
