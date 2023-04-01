package net.dmytro.homework11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerConfiurationTest {
    @Test
            void getLoggerLevelTest(){
        FileLoggerConfiguration loggerConfiguration = new FileLoggerConfiguration();

        loggerConfiguration.setLevel(LogginLevel.INFO);
        LogginLevel level = loggerConfiguration.getLevel();
        loggerConfiguration.setLevel(LogginLevel.DEBUG);
        LogginLevel level1 = loggerConfiguration.getLevel();
        Assertions.assertEquals(LogginLevel.INFO,level);
        Assertions.assertEquals(LogginLevel.DEBUG,level1);

    }


}
