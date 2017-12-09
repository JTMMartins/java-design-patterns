package FactoryPatternSimple;

public class App {

    public static void main(String[] args) {
        String messageText = " This is a message from our company. Many thanks";
        MessageType type = MessageType.SMSMessage;

        Message messageSender = new MessageFactory().construct(type);
        messageSender.sendMessage(messageText);


        type = MessageType.EmailMessage;
        messageSender = new MessageFactory().construct(type);
        messageSender.sendMessage(messageText);

        type = MessageType.FaxMessage;
        messageSender = new MessageFactory().construct(type);
        messageSender.sendMessage(messageText);
    }
}
