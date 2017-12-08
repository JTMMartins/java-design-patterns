package Decorator.MessageExample;


public abstract class MessageDecorator implements Message {

    protected Message decoratedMessage;


    public MessageDecorator(Message message) {

        this.decoratedMessage = message;
    }

    public abstract void sendMessage(String message);


    public Message getDecoratedMessage() {

        return this.decoratedMessage;
    }

}
