package com.sagarandcompany.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.modules.junit4.PowerMockRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

@RunWith(PowerMockRunner.class)
public class NotificationServiceTest {
    @Mock
    SpringTemplateEngine springTemplateEngine;
    @Mock
    TemplateEngine templateEngine;
    @InjectMocks
    NotificationService notificationService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test() {
        Context context = new Context();
        context.setVariable("test", "test");
//        SpringTemplateEngine springTemplateEngine = Mockito.spy(new SpringTemplateEngine());
//        springTemplateEngine.setMessageResolvers(new HashSet<>());
        Mockito.when(springTemplateEngine.process("index", context)).thenReturn("dummy");
//        Mockito.when(templateEngine.process("index", context)).thenReturn("dummy");
        notificationService.template();
    }
}
