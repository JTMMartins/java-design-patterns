package FactoryPatternSimple;

public class MessageFactory {

    public Message construct(MessageType type) {

        switch (type) {

            case SMSMessage:

                return new SMS();

            case EmailMessage:

                return new Email();

            case FaxMessage:

                return new Fax();
        }
        throw new NullPointerException("Invalid Message Type");
    }
}
