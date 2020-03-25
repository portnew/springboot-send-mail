package com.zhang;

import com.zhang.service.MailServiceImpl;
import com.zhang.service.Mailservice;
import com.zhang.vo.MailVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @ClassName MailApplicationTests
 * @Description TODO
 * @Author zhy
 * @Date 2020/3/25 8:07
 */
@SpringBootTest
public class MailApplicationTests {
    @Autowired
    private JavaMailSenderImpl mailSender;

    @Autowired
    private Mailservice mailservice;
    String to = "865383353@qq.com";
    String subject = "来自SpringBoot";
    String content = "Happy EveryDay";
    @Test
    public void sendSimpleMail(){
        mailservice.sendSimpleMail(to,subject,content);
    }
    @Test
    public void sendHtmlMail(){
        content = content + "<h1>我是张浥尘<h1>";
        mailservice.sendHtmlMail(to,subject+" Html Mail",content);
    }
    @Test
    public void sendAttachmentMail(){
        String filePath = "C:\\Users\\PSDZ\\Desktop\\封面23.jpg";
        mailservice.sendAttachmentMail(to,subject+"附件",content,filePath);
    }

    @Autowired
    MailServiceImpl service;
    @Test
    public void sendMail() {
        MailVo message = new MailVo();
        message.setFrom(service.getMailSendFrom());
        message.setTo(to);
        message.setText(content);
        message.setSubject(subject);
        service.sendMail(message);
    }
}
