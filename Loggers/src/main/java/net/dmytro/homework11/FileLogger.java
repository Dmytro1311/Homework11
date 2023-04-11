package net.dmytro.homework11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger extends AbstractLogger{
    FileLoggerConfiguration fileLoggerConfiguration;
    File file;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss a ");
    SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("dd_MM_yyyy-hh_mm_ss_ms");


    public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) {
        super(fileLoggerConfiguration);
        this.fileLoggerConfiguration = fileLoggerConfiguration;
        this.file = new File(fileLoggerConfiguration.path);
    }



    @Override
    public void info(String massage) throws IOException {
        logMessage(LogginLevel.INFO, massage);

    }

    @Override
    public void debug(String message) throws IOException {
        logMessage(LogginLevel.DEBUG, message);

    }

    public void logMessage(LogginLevel level, String message) throws IOException {
        if (fileLoggerConfiguration.level.ordinal() >= level.ordinal()) {
            try {
                if (file.length() < fileLoggerConfiguration.size) {
                    FileWriter fileWriter = new FileWriter(file, true);
                    fileWriter.write("[" + simpleDateFormat.format(new Date()) + "]" + "[" + level + "]" + "notification: " + message + "\n");
                    fileWriter.close();

                } else {
                    throw new FileMaxSizeReachedException("file size " + file.length() + "max file size " + fileLoggerConfiguration.size + "path to file " + file);
                }
            } catch (FileMaxSizeReachedException ex) {
                file = new File(fileLoggerConfiguration.path + "LOG_" + simpleTimeFormat.format(new Date()) + fileLoggerConfiguration.format);

            }

        }
    }
}
