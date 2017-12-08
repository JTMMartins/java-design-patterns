package Decorator.MessageExample;

public class App {

    public static void main(String[] args) {


        String messageToSend = "This is an important message about the decorator pattern";

        Message message = new StandardMessage();
        message.sendMessage(messageToSend);

        Message encodedMessage = new EncriptedMessage(new StandardMessage());
        encodedMessage.sendMessage(messageToSend);

        Message reversedMessage = new ReversedMessage(new StandardMessage());
        reversedMessage.sendMessage(messageToSend);

        Message encodedAndReversedMessage = new EncriptedMessage(new ReversedMessage(new StandardMessage()));
        encodedAndReversedMessage.sendMessage(messageToSend);

        Message reversedAndEncoded = new ReversedMessage(new EncriptedMessage(new StandardMessage()));
        reversedAndEncoded.sendMessage(messageToSend);

        Message doubleReversed = new ReversedMessage(new ReversedMessage(new StandardMessage()));
        doubleReversed.sendMessage(messageToSend);


    }
}
