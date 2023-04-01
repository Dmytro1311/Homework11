package net.dmytro.homework11;

public class FileMaxSizeReachedException extends RuntimeException{
    public FileMaxSizeReachedException(String message) {
        super(message);
    }
}
