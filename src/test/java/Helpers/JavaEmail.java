package Helpers;


import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

public class JavaEmail {

    Properties emailProperties;
    Session mailSession;
    MimeMessage emailMessage;

    public void setMailServerProperties() {

        String emailPort = "587";//gmail's smtp port

        emailProperties = System.getProperties();
        emailProperties.put("mail.smtp.port", emailPort);
        emailProperties.put("mail.smtp.auth", "true");
        emailProperties.put("mail.smtp.starttls.enable", "true");

    }

    public void createEmailMessage(String screenshotAddress) throws AddressException,
            MessagingException {



        String[] toEmails = {"vikentiy.kelevich@gmail.com",
                //        "julia.peresunko@ukad-group.com"
        };
        String emailSubject = "There are broken markup pages on Ukad web site";
        String emailBody = "Please check the attachment";

        mailSession = Session.getDefaultInstance(emailProperties, null);
        emailMessage = new MimeMessage(mailSession);

        for (int i = 0; i < toEmails.length; i++) {
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
        }
        File f = new File(screenshotAddress);
        MimeBodyPart msg = new MimeBodyPart();
        msg.setText(" ");
        Multipart m = new MimeMultipart();
        m.addBodyPart(msg);

        msg = new MimeBodyPart();
        DataSource ds = new FileDataSource(f);
        msg.setDataHandler(new DataHandler(ds));
        msg.setFileName(screenshotAddress);
        m.addBodyPart(msg);

        emailMessage.setSubject(emailSubject);
        //emailMessage.setContent(emailBody, "text/html");//for a html email
        //emailMessage.setText(emailBody);// for a text email
        emailMessage.setContent(m);

    }

    public void sendEmail() throws AddressException, MessagingException {

        String emailHost = "smtp.gmail.com";
        String fromUser = "vikentiy.kelevich";//just the id alone without @gmail.com
        String fromUserEmailPassword = "manythanks4thisday";

        Transport transport = mailSession.getTransport("smtp");

        transport.connect(emailHost, fromUser, fromUserEmailPassword);
        transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
        transport.close();
        System.out.println("Email sent successfully.");
    }

}
