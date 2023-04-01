package net.dmytro.homework11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLoggerConfigurationLoader extends AbstractLoggerConfigurationLoad{
    public  FileLoggerConfiguration load(String filePath){
        FileLoggerConfiguration fileLoggerConfiguration =new FileLoggerConfiguration();
        try(BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            String str = read.readLine();
            while (str != null){
                String[] array = str.split(":");
                if (array.length == 2){
                    String key = array[0].trim();
                    String value = array[1].trim();
                    switch (key) {
                        case "FILE" -> fileLoggerConfiguration.setPath(value);
                        case "LEVEL" -> fileLoggerConfiguration.setLevel(LogginLevel.valueOf(value));
                        case "MAX-SIZE" -> fileLoggerConfiguration.setSize(Integer.parseInt(value));
                        case "FORMAT" -> fileLoggerConfiguration.setFormat(value);

                    }
                }
                str = read.readLine();

            }

        }catch (IOException ex){
            throw new RuntimeException(ex);
        }
        return fileLoggerConfiguration;

    }
}
