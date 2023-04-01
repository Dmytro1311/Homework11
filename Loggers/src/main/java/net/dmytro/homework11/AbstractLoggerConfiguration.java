package net.dmytro.homework11;

public  class AbstractLoggerConfiguration {
    public LogginLevel level;

    public void setLevel(LogginLevel level) {
        this.level = level;
    }

    public AbstractLoggerConfiguration(LogginLevel level) {
        this.level = level;
    }

    public LogginLevel getLevel() {
        return level;
    }

    public AbstractLoggerConfiguration() {
    }

}
