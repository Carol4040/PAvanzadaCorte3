package com.gestion.empleados.util.scheduling;

import com.gestion.empleados.entidades.EmpleadoEmailSalario;
import com.gestion.empleados.servicio.EmpleadoService;
import com.gestion.empleados.util.mail.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ScheduledTasks {

    private final EmailService emailService;
    private final EmpleadoService empleadoService;

    @Autowired
    public ScheduledTasks(EmailService emailService, EmpleadoService empleadoService) {
        this.emailService = emailService;
        this.empleadoService = empleadoService;
    }

    @Scheduled(cron = "0 30 18 * * ?")
    public void scheduleTaskAt6PM() {
        System.out.println("Scheduled task at 4:40 PM - " + System.currentTimeMillis() / 1000);
        List<EmpleadoEmailSalario> empleados = empleadoService.findAllEmailsAndSalaries();
        String subject = "Pago de Salario";

        for (EmpleadoEmailSalario empleado : empleados) {
            String text = "Se ha pagado la cantidad de: " + empleado.getSalario() + " a usted. Muchas gracias por sus servicios.";
            emailService.sendSimpleMessage(empleado.getEmail(), subject, text);
        }
    }
}