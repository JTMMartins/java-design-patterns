package FactoryPatternSimple;

public class SMS implements Message {

    @Override
    public void sendMessage(String message) {
        System.out.println("I'm sending an SMS with the text : " + message);
    }
}
