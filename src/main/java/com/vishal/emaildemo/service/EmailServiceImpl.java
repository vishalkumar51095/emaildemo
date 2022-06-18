package com.vishal.emaildemo.service;

import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Service;

import javax.websocket.Session;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

@Service
public class EmailService {

    public void sendEmail(String subject,String message,String to){

        //variable for gmail
        String host="smtp.gmail.com";

        //get the system properties
        Properties properties=System.getProperties();
        System.out.println("PROPERTIES " + properties);

        //setting important information to properties object

        //host set
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");

        //step 1: to get session object..
        Session session= Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
           return new PasswordAuthentication("vishalkumar51095@gmail.com","@IL0veMyM0m");
            }

        });

        session.setDebug(true);

        //Step 2 : compose the message[text,multi media]
        MimeMessage m=new MimeMessage(session);

        try{

            //from email
            m.setFrom(from);

            //adding recipient to message
            m.setRecipient(Message.RecipientType.To,new InternetAddress(to));

        }






























































































































































































































































































































































































































































































































































































































































































































































































    }
}
