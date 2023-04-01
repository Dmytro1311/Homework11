package net.dmytro.homework11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileLoggerConfigurationTest {
    private static final String pathToConfig = "src/test/resources/logConfig.txt";



    @Test
    void loadConfigFromValidFileTest()  {
         FileLoggerConfigurationLoader fileLoggerConfigurationLoader = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration configuration = fileLoggerConfigurationLoader.load(pathToConfig);
//
        Assertions.assertTrue(configuration.getLevel() == LogginLevel.INFO || configuration.getLevel() == LogginLevel.DEBUG);

    }
    @Test
    void loadConfigFromInvalidFile(){
        FileLoggerConfigurationLoader fileLoggerConfigurationLoader = new FileLoggerConfigurationLoader();
        Assertions.assertThrows(RuntimeException.class, () -> fileLoggerConfigurationLoader.load("pathToConfig"));

    }

}
