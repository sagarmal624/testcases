package com.sagarandcompany.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.internet.MimeMessage;

@Service
public class NotificationService {
    @Autowired
    ITemplateEngine springTemplateEngine;

    public MimeMessage template() {
        Context context = new Context();
        JavaMailSender javaMailSender=new JavaMailSenderImpl();
        context.setVariable("test", "test");
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        return mimeMessage;
    }
}
