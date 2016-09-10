package ru.Korenskiy;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataResults {
    private String targetFilename;
    private FileWriter fileWriter;
    private char[][] stringsTargetArray;

    public DataResults(String targetFilename, char[][] stringsTargetArray){
        this.targetFilename = targetFilename;
        this.stringsTargetArray = stringsTargetArray;
    }

    public void buildDataResultsFile(){
        try {
            fileWriter = new FileWriter(new File(targetFilename));
            for(int i=0; i<stringsTargetArray.length; i++) {
                fileWriter.write(stringsTargetArray[i]);
                fileWriter.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Запись в файл невозможна. Попробуйте выбрать другую директорию для запуска программы");
            Thread.currentThread().stop();
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Произошла ошибка ввода/вывода при закрытии потока записи в файл");
            Thread.currentThread().stop();
        }
    }
}

