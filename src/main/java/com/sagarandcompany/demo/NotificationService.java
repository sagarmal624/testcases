package com.sagarandcompany.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

@Service
public class NotificationService {
    @Autowired
    SpringTemplateEngine springTemplateEngine;

    public String template() {
        Context context = new Context();
        context.setVariable("test", "test");
        return springTemplateEngine.process("index", context);
    }
}
