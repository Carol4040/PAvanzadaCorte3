package com.gestion.empleados.util.scheduling;

import com.gestion.empleados.util.mail.EmailService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private final EmailService emailService;

    public ScheduledTasks(EmailService emailService) {
        this.emailService = emailService;
    }

    @Scheduled(fixedRate = 5000)
    public void scheduleFixedRateTask() {
        System.out.println("Fixed rate task - " + System.currentTimeMillis() / 1000);
        emailService.sendSimpleMessage(
                "andres.garces@grupomok.com",
                "Scheduled Task Email",
                "This is a scheduled task email sent at " + System.currentTimeMillis() / 1000
        );
    }
}