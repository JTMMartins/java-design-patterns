package FactoryPatternSimple;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MessageFactoryTest {

    @Test
    public void createMessage() {

        Message emailMessage = new MessageFactory().construct(MessageType.EmailMessage);
        verifyMessage(emailMessage, Email.class);

        Message faxMessage = new MessageFactory().construct(MessageType.FaxMessage);
        verifyMessage(faxMessage, Fax.class);

        Message smsMessage = new MessageFactory().construct(MessageType.SMSMessage);
        verifyMessage(smsMessage, SMS.class);

    }


    private void verifyMessage(Message message, Class<?> clazz) {
        assertTrue(clazz.getName(), clazz.isInstance(message));
        System.out.println("This message belongs to class : " + clazz.getName());
    }

}