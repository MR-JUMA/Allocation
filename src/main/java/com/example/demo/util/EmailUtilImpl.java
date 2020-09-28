package com.example.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class EmailUtilImpl implements EmailUtil {


    @Autowired
    private JavaMailSender sender;

    @Override
    public void sendEmail(String toAddress, String subject, String body) {
        MimeMessage message= sender.createMimeMessage();
        MimeMessageHelper x=new MimeMessageHelper(message);
        try {
            x.setTo(toAddress);
            x.setSubject(subject);
            x.setText(body);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        sender.send(message);

    }
}
