package day23.Exceptions;

import java.util.Random;

public class InvalidNumberException extends RuntimeException {

    public InvalidNumberException(String message) {
        super(message);
    }

}
