package Decorator.MessageExample;

import java.util.Base64;

public class Enigma {

    /**
     * codes the message in B64
     */
    public String B64Encode(String messageToEncrypt) {

        byte[] bytesEncoded = Base64.getEncoder().encode(messageToEncrypt.getBytes());
        return new String(bytesEncoded);
    }

    /**
     * Inverts a string
     * abc -> cba
     */
    public String reverser(String messageToReverse) {

        return new StringBuilder(messageToReverse).reverse().toString();
    }
}

