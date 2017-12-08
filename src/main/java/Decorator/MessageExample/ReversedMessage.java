package Decorator.MessageExample;

public class ReversedMessage extends MessageDecorator {

    public ReversedMessage(Message message) {

        super(message);
    }

    @Override
    public void sendMessage(String message) {

        Enigma enigma = new Enigma();
        String reversedMessage = enigma.reverser(message);
        this.getDecoratedMessage().sendMessage(reversedMessage);
    }
}
