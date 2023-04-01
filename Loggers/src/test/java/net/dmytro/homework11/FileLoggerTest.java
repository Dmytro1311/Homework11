package net.dmytro.homework11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class FileLoggerTest {
    private FileLoggerConfiguration config;
    private FileLogger fileLogger;

    @BeforeEach
    public void setUp() {
        config = new FileLoggerConfiguration();
        config.setPath("src/test/resources/logs/");
        config.setLevel(LogginLevel.DEBUG);
        config.setSize(1000);
        config.setFormat(".txt");
        fileLogger = new FileLogger(config);
    }

    @Test
    public void infoMessageTest() throws IOException {
        String message = "info";
        fileLogger.info(message);
        assertTrue(file(fileLogger.file, message));
    }

    @Test
    public void debugMessageTest() throws IOException {
        String message = "debug";
        fileLogger.debug(message);
        assertTrue(file(fileLogger.file, message));
    }
    private boolean file(File file, String text) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null){
                if (line.contains(text)) {
                    return true;

                }

            }
        }
        return false;
    }


}
