package FactoryPatternSimple;

public class Fax implements Message {

    @Override
    public void sendMessage(String message) {
        System.out.println("I'm sending an FAX with the text : " + message);
    }
}
