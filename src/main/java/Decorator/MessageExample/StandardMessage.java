package Decorator.MessageExample;

public class StandardMessage implements Message {


    @Override
    public void sendMessage(String message) {

        System.out.println("Message to send :");
        System.out.println(message + "\n");

    }
}
