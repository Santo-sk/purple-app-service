package com.purple.pw_service.service.imp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService
{
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String fromEmailAddress;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(String toEmailAddress, String subject, String body) {
        // Send email
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(fromEmailAddress);
        mailMessage.setTo(toEmailAddress);
        mailMessage.setSubject(subject);
        mailMessage.setText(body);
        javaMailSender.send(mailMessage);
        System.out.println("Email sent successfully");
    }
}
