/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karaca.kemalsamikaraca.mail;

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author kemalsamikaraca
 */

@ManagedBean
@SessionScoped
public class MailBean implements Serializable{
    
    private String mail;
    private String name;
    private String messageContent;

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the messageContent
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * @param messageContent the messageContent to set
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
    
    public void sendMail(){
        
        String sendGridAPI = "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";
        
        Email from = new Email("kskaraca@gmail.com");
        String subject = "kemalsamikaraca.com ";
        Email to = new Email("kskaraca@gmail.com");
        Content content = new Content("text/plain", this.messageContent + " ---- " + this.name + " ---- " + this.mail);
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sendgrid = new SendGrid(sendGridAPI);
        Request request = new Request();
        try {
          request.method = Method.POST;
          request.endpoint = "mail/send";
          request.body = mail.build();
          Response response = sendgrid.api(request);
          
          System.out.println(response.statusCode);
          System.out.println(response.body);
          System.out.println(response.headers);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        
        
    }
    
}
