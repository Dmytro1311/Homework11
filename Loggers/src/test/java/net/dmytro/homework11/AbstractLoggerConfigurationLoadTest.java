package net.dmytro.homework11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class AbstractLoggerConfigurationLoadTest {



    @Test
            void validConfigPathTest()  {

        AbstractLoggerConfigurationLoad abstractLoggerConfigurationLoad = new AbstractLoggerConfigurationLoad() {

            @Override
            public AbstractLoggerConfiguration load(String path) {
                return null;
            }
        };
        AbstractLoggerConfiguration abstractLoggerConfiguration = abstractLoggerConfigurationLoad.load("valid/filePath/path");
        Assertions.assertNull(abstractLoggerConfiguration);
    }

}
