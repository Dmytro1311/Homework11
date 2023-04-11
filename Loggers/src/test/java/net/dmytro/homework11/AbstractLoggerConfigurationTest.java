package net.dmytro.homework11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractLoggerConfigurationTest {
    @Test
    void abstractLoggerConfigurationTest(){
        LogginLevel expectLevel = LogginLevel.DEBUG;
        AbstractLoggerConfiguration configuration = new AbstractLoggerConfiguration(expectLevel);
        Assertions.assertEquals(expectLevel,configuration.getLevel());
    }
}
