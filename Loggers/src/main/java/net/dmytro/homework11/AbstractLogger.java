package net.dmytro.homework11;

import java.io.IOException;

public abstract class AbstractLogger {
    AbstractLoggerConfiguration abstractLoggerConfiguration;

    public AbstractLogger(AbstractLoggerConfiguration abstractLoggerConfiguration) {
        this.abstractLoggerConfiguration = abstractLoggerConfiguration;
    }
    public abstract void info (String massage) throws IOException;
    public abstract void debug(String message) throws IOException;
}
