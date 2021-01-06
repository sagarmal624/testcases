package com.sagarandcompany.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.mail.javamail.JavaMailSender;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import static org.mockito.Mockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore("javax.net.ssl.*")
public class NotificationServiceTest {

    @Mock
    ITemplateEngine springTemplateEngine;
    @InjectMocks
    NotificationService notificationService;
//    @Mock
//    JavaMailSender javaMailSender;
    private MimeMessage mimeMessage = null;

    @Before
    public void init() {
        mimeMessage = new MimeMessage((Session) null);
//        JavaMailSender javaMailSender=mock(JavaMailSender.class);

//        when(javaMailSender.createMimeMessage()).thenReturn(mimeMessage);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test() {
        Context context = new Context();
        context.setVariable("test", "test");
//        SpringTemplateEngine springTemplateEngine = Mockito.spy(new SpringTemplateEngine());
//        springTemplateEngine.setMessageResolvers(new HashSet<>());
//        SpringTemplateEngine springTemplateEngine = mock(SpringTemplateEngine.class);
//        templateEnginetemplateEngine.setMessageResolvers(messageResolvers);
        Mockito.when(springTemplateEngine.process(Mockito.any(String.class), Mockito.any(Context.class))).thenReturn("dummy");
        //        Mockito.when(templateEngine.process("index", context)).thenReturn("dummy");
        Assert.assertNotNull(notificationService.template());
    }
}
