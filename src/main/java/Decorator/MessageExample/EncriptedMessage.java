package Decorator.MessageExample;

public class EncriptedMessage extends MessageDecorator {

    public EncriptedMessage(Message message) {
        super(message);
    }

    @Override
    public void sendMessage(String message) {
        Enigma enigma = new Enigma();
        String enigmatedMessage = enigma.B64Encode(message);
        this.getDecoratedMessage().sendMessage(enigmatedMessage);
    }
}
