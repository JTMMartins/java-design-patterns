package FactoryPatternSimple;


public class Email implements Message {

    @Override
    public void sendMessage(String message) {

        System.out.println("I'me sending an Email with the text : " + message);
    }
}
