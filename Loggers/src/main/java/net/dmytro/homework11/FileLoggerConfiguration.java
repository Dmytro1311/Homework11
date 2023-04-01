package net.dmytro.homework11;

public class FileLoggerConfiguration extends AbstractLoggerConfiguration{
    public String path;
    LogginLevel level;
    public int size;
    public String format;

    public void setPath(String path) {
        this.path = path;
    }

    public void setLevel(LogginLevel level) {
        this.level = level;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public LogginLevel getLevel() {
        return level;
    }

    public String getPath() {
        return path;
    }

    public int getSize() {
        return size;
    }

    public String getFormat() {
        return format;
    }

    public FileLoggerConfiguration(LogginLevel level) {
        super(level);
    }
    public FileLoggerConfiguration(){

    }

}

