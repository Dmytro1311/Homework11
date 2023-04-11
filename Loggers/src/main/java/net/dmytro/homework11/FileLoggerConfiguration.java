package net.dmytro.homework11;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileLoggerConfiguration extends AbstractLoggerConfiguration{
    public String path;
    LogginLevel level;
    public int size;
    public String format;


    public FileLoggerConfiguration(){

    }

}

